package contest;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {
    public String removeDuplicates(String s, int k) {
        String result = "";

        Stack<Element> stack= new Stack<>();
        for(int i = 0;i < s.length(); i++){
            if(stack.isEmpty()){
                stack.push( new Element(s.charAt(i),1));
            }else{
                Element element=  stack.peek();
                //System.out.println(element.character+" with "+element.frequency);
                if(element.character == s.charAt(i)){
                    element=  stack.pop();
                    element= new Element(s.charAt(i),element.frequency+1);
                    System.out.println(element.character+" with "+element.frequency);
                    if(element.frequency >= k){
                        element= new Element(s.charAt(i),element.frequency -k );
                        System.out.println(element.character+" out "+element.frequency);
                    }

                }
                else{
                    element = new Element(s.charAt(i),1);
                }
                if(element.frequency != 0){
                    stack.push(element);
                }

            }
        }

        System.out.println( stack.size());
        while(!stack.isEmpty()){

            result = Character.toString(stack.pop().character) + result;
        }
        return result;
    }

}
class Element{
    char character;
    int frequency;
    Element(char character, int frequency){
        this.character = character;
        this.frequency = frequency;
    }
}