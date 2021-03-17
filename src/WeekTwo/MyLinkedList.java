package WeekTwo;

public class MyLinkedList {


    /**
     * Initialize your data structure here.
     */
    ListNode head;
    ListNode tail;
    int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        ListNode node = head;
        int count = 0;
        int val = -1;
        while (node != null) {
            if (count == index) {
                val = node.val;
                break;
            }

            node = node.next;

            count++;
        }
        return val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        ListNode temp = head;
        head = new ListNode(val, temp);
        this.size++;
        if (tail == null) {
            tail = head;
        }
        // System.out.println(head.val+" head ");
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {

        this.size++;
        if (head == null) {
            this.addAtHead(val);
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(val);
            this.size++;
        }
        //   System.out.println(head.val+" head ");
        //   System.out.println(tail.val+" tail ");
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the letngth, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        // if(index >= this.size){
        //     return;
        // }
        ListNode node = head;
        int count = 0;
        if (index == 0) {
            this.addAtHead(val);
        }
        while (node != null) {
            if (count == index - 1) {
                ListNode temp = node.next;
                ;
                node.next = new ListNode(val, temp);
                this.size++;
                //    System.out.println(node.next.val+" index ");
                //  System.out.println(head.val+" head ");
                // System.out.println(tail.val+" tail ");
                break;
            }

            node = node.next;
            count++;
        }

    }


    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= this.size) {
            return;
        }
        ListNode node = head;
        int count = 0;
        if (index == 0) {
            head = head.next;
            return;
        }
        while (node.next != null) {
            if (count == index - 1) {
                node.next = node.next.next;
                this.size--;
                // node.next =  new ListNode(val, temp);
                break;
            }
            node = node.next;
            count++;
        }
    }
}



