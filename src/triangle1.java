public class triangle1 {
    public static void main(String[] args) {
        showTriangle(5);
    }
    public static void showTriangle(int n){
        for(int i=0;i<n;i++){
            System.out.println("*".repeat(i+1));
        }
    }
}
