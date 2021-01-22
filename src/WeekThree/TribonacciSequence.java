package WeekThree;

public class TribonacciSequence {
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }
   static int tribonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1 || n==2){
            return 1;
        }
        return tribonacci(n-3)+tribonacci(n-2)+tribonacci(n-1);
    }
}
