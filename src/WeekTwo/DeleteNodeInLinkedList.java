package WeekTwo;

public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        if(node.next == null ){
            node = null;
            return;
        }
        ListNode temp=node.next;
        node.val=temp.val;
        node.next=temp.next;
    }
}
