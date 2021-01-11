package WeekOne;

public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        int inParanthesis=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(inParanthesis>max){
                max=inParanthesis;
            }
            if(s.charAt(i)=='('){
                inParanthesis++;
            }
            else if(s.charAt(i)==')'){
                inParanthesis--;
            }
            if(inParanthesis>max){
                max=inParanthesis;
            }
        }
        return max;
    }
}
