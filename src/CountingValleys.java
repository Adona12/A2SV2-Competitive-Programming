public class CountingValleys {
    public  int countingValleys(String path,int steps) {
        int count = 0;
        int valley = 0;
        for (int i = 0; i < steps; i++) {

            if (path.charAt(i) == 'U') {
                count++;
            } else if (path.charAt(i) == 'D' && count == 0) {
                count--;
                valley++;
            } else if (path.charAt(i) == 'D') {
                count--;
            }
        }
        return valley;
    }
}
