package WeekOne;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode previous=null;
        ListNode current=head;
        ListNode newNode=null;
        ListNode temp=null;
        while(current!=null){

            temp=current.next;
            newNode=current;
            newNode.next=previous;
            previous=newNode;
            current=temp;
        }
        return newNode;

    }

}

