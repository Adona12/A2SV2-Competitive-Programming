package WeekThree;

import java.util.PriorityQueue;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> maxHeap= new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < lists.length; i++){
            ListNode node = lists[i];
            while(node != null){
                maxHeap.add(node.val);
                node = node.next;
            }
        }

        ListNode head=null;
        while(!maxHeap.isEmpty()){
            int num =maxHeap.poll();

            if(head == null){
                head = new ListNode(num);

            }
            else{
                ListNode temp = head;
                head = new ListNode(num,temp);
            }
        }
        return head;

    }
}
