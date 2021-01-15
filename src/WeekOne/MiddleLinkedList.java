package WeekOne;

public class MiddleLinkedList {

    public static void main(String[] args) {
        Node linkedList = new Node(3, new Node(4, new Node(0, new Node(8, new Node(10)))));
        System.out.println(middle(linkedList));
    }
    public static Node middle(Node node){
        Node slow=node;
        Node fast=node;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
}
