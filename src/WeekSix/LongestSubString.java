package WeekSix;

import java.util.HashSet;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        HashSet<Character> hash = new HashSet<>();
        int max = 0;
        if(s.length() == 1){
            return 1;
        }
        while(rightPointer < s.length()){
            if(leftPointer == rightPointer){
                hash.add(s.charAt(rightPointer));
                rightPointer++;

            }else{
                if(hash.contains( s.charAt(rightPointer))){
                    hash.remove( s.charAt(leftPointer));
                    int temp = rightPointer - leftPointer;
                    if(temp > max){
                        max = temp;
                    }
                    //      System.out.println("leftPointer: "+leftPointer+" rightPointer: "+rightPointer+" max: "+max);
                    leftPointer++;

                }
                else{
                    hash.add(s.charAt(rightPointer));
                    rightPointer++;
                }

            }

        }
        if(!hash.isEmpty()){
            int size = hash.size();;
            if(size > max){
                max = size;
            }

        }
        return max;
    }
}
