package contest;

public class CycleDetection {
    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode slow=head;
        SinglyLinkedListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            if(fast==slow || fast.next==slow){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}
