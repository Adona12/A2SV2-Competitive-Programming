package WeekOne;

public class Triangle2 {
    public static void main(String[] args) {
        showTriangle2(5);
    }
    public static void showTriangle2(int n){
        int j=1;
        int count=4;
        for(int i=5;i>0;i--){
            System.out.println(duplicate(count," ")+duplicate(j,"*"));
            j+=2;
            count--;
        }
    }
    public static String duplicate(int count,String s){
        String answer="";
       for(int i=0;i<count;i++){
           answer+=s;
       }
       return answer;
    }

}
