package WeekOne;

import java.util.LinkedList;
import java.util.List;

public class DeleteInLinkedList {
    public static void main(String[] args) {
        Node linkedList = new Node(3, new Node(4, new Node(0, new Node(8, new Node(10)))));
        System.out.println(deleteLinkedList(linkedList,88));
    }

    public static boolean deleteLinkedList(Node linkedList, int data) {
        Node head = linkedList;
        if (linkedList.val == data) {
            head = linkedList.next;
            return true;
        }
        while (linkedList != null) {
            if (linkedList.next != null && linkedList.next.val == data) {
                  linkedList.next=linkedList.next.next;
                  return true;
            }
            linkedList=linkedList.next;

        }
        return  false;
    }
}
