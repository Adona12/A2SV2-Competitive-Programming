package contest;

public class FindMergeSortOfTwoLists {
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode node1=head1;
        SinglyLinkedListNode node2=head2;
        while(node1!=null){
            node2=head2;
            while(node2!=null){
                if(node1==node2){
                    return node1.data;
                }
                node2=node2.next;
            }
            node1=node1.next;
        }
        return 0;

    }

}
 class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
    SinglyLinkedListNode() {}
    SinglyLinkedListNode(int val) { this.data = val; }
    SinglyLinkedListNode(int val, SinglyLinkedListNode next) { this.data = val; this.next = next; }
}