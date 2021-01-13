package WeekOne;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
    public static int fibonacci(int n){
        int x=0;
        int y=1;
        int total=0;

       for(int i=1;i<n;i++){
          total=x+y;
          x=y;
          y=total;

       }
       return y;
    }
}
