package WeekOne;

public class MergeSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head =null;
        ListNode merged=null;

        if(l1==null && l2!=null){
            return l2;
        }
        else if(l2 ==null && l1!=null){
            return l1;
        }
        else if(l2!=null && l2!=null){
            int min=0;
            if(l2.val<l1.val){
                min=l2.val;
                l2=l2.next;
            }else{
                min=l1.val;
                l1=l1.next;
            }
            merged=new ListNode(min);
            head=merged;

        }
        while( l1!=null && l2!=null  ) {
            int min=0;
            if(l2.val<=l1.val){
                min=l2.val;

                l2=l2.next;

            }
            else{
                min=l1.val;
                l1=l1.next;

            }
            merged.next=new ListNode(min);
            merged=merged.next;
        }
        if(l2!=null&& l1==null){
            merged.next=l2;;
        }
        else if(l1!=null&& l2==null){
            merged.next=l1;;
        }

        return head;
    }
}
