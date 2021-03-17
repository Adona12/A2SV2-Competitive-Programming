package WeekTwo;

import java.util.Stack;

public class MinStack {

    /** initialize your data structure here. */
    Stack<Element> stack;
    public MinStack() {
        this.stack = new Stack<>();


    }

    public void push(int x) {
        if(stack.size() == 0){
            stack.push(new Element(x,x));
        }else if(x < stack.peek().min){
            stack.push(new Element(x,x));
        }
        else{
            stack.push(new Element(x,stack.peek().min));
        }

    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().num;
    }

    public int getMin() {
        return stack.peek().min;
    }

}
class Element{
    int num;
    int min;
    public Element(int num, int min){
        this.num = num;
        this.min = min;
    }
}
