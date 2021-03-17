package WeekTwo;

public class PalindromLinkedList {
    public boolean isPalindrome(ListNode head) {
        int count=0;
        ListNode check=head;
        while(check!=null){
            count++;
            check=check.next;
        }
        ListNode node=head;;
        for(int i=0;i<(count%2!=0?(count/2)+1:count/2);i++){
            node=node.next;
        }
        node=reverseList(node);
        for(int i=0;i<count/2;i++){
            if(node.val!=head.val){
                return false;
            }
            node=node.next;
            head=head.next;
        }
        return true;
    }
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
