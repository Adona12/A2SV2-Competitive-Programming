package WeekThree;


import WeekTwo.ListNode;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
    // ListNode linkedList = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4,new ListNode(5,new ListNode(6)))))));
      //  ListNode linkedList = new ListNode(6);
       //  ListNode linkedList = new ListNode(6, new ListNode(6, new ListNode(6, new ListNode(6))));
//            ListNode h=    removeElements(linkedList,6);
//        while (h!=null){
//            System.out.println(h.val);
//            h=h.next;
//        }
    }
    public static ListNode removeElements(ListNode head,int val){


        while(head!=null){
            if(head.val==val){
                head=head.next;
            }else{
                break;//
            }
        }
        ListNode node=head;
        ListNode checkerNode=head;
        while (checkerNode!=null){
            //System.out.println(checkerNode.val);
            if(checkerNode.val!=val && node!=checkerNode){
              //  System.out.println(checkerNode.val);
                node.next=checkerNode;
                node=node.next;

            }
           checkerNode=checkerNode.next;

        }
        if(node!=null) {
            node.next = null;
        }
        return head;
    }
}
//    public static ListNode removeElements(ListNode head,int val){
//
//
//        while(head!=null){
//            if(head.val==val){
//                head=head.next;
//            }else{
//                break;//
//            }
//        }
//        ListNode node=head;
//        ListNode checkerNode=head;
//        while (node!=null && node.next!=null){
////            System.out.println(node.val);
//            if (node.next.val==val){
//                node.next=node.next.next;
//            }
//            node=node.next;
//        }
//        return head;
//    }
//}
