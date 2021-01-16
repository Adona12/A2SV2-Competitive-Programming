package contest;

import java.util.Stack;

public class FindMergeSortOfTwoLists {
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        Stack<SinglyLinkedListNode> stack1=new Stack<SinglyLinkedListNode>();
        Stack<SinglyLinkedListNode> stack2=new Stack<SinglyLinkedListNode>();
        while(head1!=null){
            stack1.push(head1);
            head1=head1.next;
        }
        while(head2!=null){
            stack2.push(head2);
            head2=head2.next;
        }
        int temp=0;
        while(!stack1.isEmpty() && !stack2.isEmpty()){

            if(stack1.peek()==stack2.peek()){
                temp=stack1.pop().data;
                stack2.pop();
            }
            else{
                break;
            }
        }
        return temp;
    }

}
 class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
    SinglyLinkedListNode() {}
    SinglyLinkedListNode(int val) { this.data = val; }
    SinglyLinkedListNode(int val, SinglyLinkedListNode next) { this.data = val; this.next = next; }
}