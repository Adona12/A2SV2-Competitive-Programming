package WeekTwo;

import java.util.Stack;

public class QueueWithStack {

    public static void main(String[] args) {

}
class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MyQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);


    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        //  return stack1.pop();
        while(stack1.size()!=1){
            stack2.push(stack1.pop());
        }
        int x=stack1.pop();
        while(stack2.size()!=0){
            stack1.push(stack2.pop());
        }

        return x;
    }

    /** Get the front element. */
    public int peek() {
        while(stack1.size()!=1){
            stack2.push(stack1.pop());
        }
        int x=stack1.peek();
        stack2.push(stack1.pop());
        while(stack2.size()!=0){
            stack1.push(stack2.pop());
        }


        return x;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */