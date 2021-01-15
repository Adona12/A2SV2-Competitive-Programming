package WeekTwo;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class StackWithQueue {


}
class MyStack {

    /** Initialize your data structure here. */
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public MyStack() {
        queue1=new ArrayDeque();
        queue2=new ArrayDeque();

    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int x=0;
        while(queue1.size()!=0){
            if(queue1.size()==1){
                x=queue1.remove();
                break;
            }
            queue2.add(queue1.remove());
        }
        while(queue2.size()!=0){
            queue1.add(queue2.remove());
        }
        return x;
    }

    /** Get the top element. */
    public int top() {
        int x=0;
        while(queue1.size()!=0){
            if(queue1.size()==1){
                x=queue1.peek();
            }
            queue2.add(queue1.remove());
        }
        while(queue2.size()!=0){
            queue1.add(queue2.remove());
        }
        return x;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
