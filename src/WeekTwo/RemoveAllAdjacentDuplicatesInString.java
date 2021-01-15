package WeekTwo;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String S) {
        Stack<Character> chars=new Stack<Character>();
        char temp=' ';
        for(int i=0;i<S.length();i++){
            if(chars.isEmpty()){
                chars.push(S.charAt(i));
                temp=S.charAt(i);
                System.out.println("first "+temp);
            }else{
                if(chars.peek()==S.charAt(i)){
                    chars.pop();

                }
                else{
                    chars.push(S.charAt(i));
                }
            }
        }
        S="";
        while(!chars.isEmpty()){
            S=Character.toString(chars.pop())+S;
        }
        return S;
    }

}
