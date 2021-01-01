public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode total=null;
        ListNode head=null;

        int carry=0;
        int count=0;
        int summation=0;
        int x=0;
        while(l1!=null || l2!=null){
            if(l1!=null && l2==null){
                x=l1.val+carry;
            }
            else if(l2!=null && l1==null){
                x=l2.val+carry;
            }
            else {
                x=l1.val+l2.val+carry;
            }

            if(x>9){
                summation=x%10;
                carry=1;
            }else{
                summation=x;
                carry=0;
            }
            if(l1!=null && l2==null){
                l1=l1.next;
            }
            else if(l2!=null && l1==null){
                l2=l2.next;
            }
            else{
                l1=l1.next;
                l2=l2.next;
            }



            if(count==0){

                total=new ListNode(summation);
                head=total;
                count++;
            }
            else{

                total.next=new ListNode(summation);
                total=total.next;


            }

        }

        if(carry!=0){
            total.next=new ListNode(1);
            total=total.next;
        }
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

