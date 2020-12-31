public class Reverse {
    public int reverse(int x) {
        long answer=0;

        if(x==0 ){
            return  0;
        }


        while(x!=0) {
            answer=answer*10;
            answer=answer+x%10;
            x=x/10;
            if(answer>Integer.MAX_VALUE || answer<Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int)answer;
    }
}
