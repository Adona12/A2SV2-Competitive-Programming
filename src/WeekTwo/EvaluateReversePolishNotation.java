package WeekTwo;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String value=tokens[i];
            if(value.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(value.equals("-")){
                int x=stack.pop();
                stack.push(stack.pop()-x);

            }
            else if(value.equals("*")){
                stack.push(stack.pop()*stack.pop());

            }
            else if(value.equals("/")){
                int x=stack.pop();
                stack.push(stack.pop()/x);

            }
            else{
                stack.push(Integer.parseInt(value));
            }
        }
        return stack.pop();
    }
}
