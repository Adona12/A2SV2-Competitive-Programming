package WeekOne;

public class triangle1 {
    public static void main(String[] args) {
        showTriangle(5);
    }
    public static void showTriangle(int n){
        for(int i=0;i<n;i++){
            System.out.println(duplicate(i+1,"*"));
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
