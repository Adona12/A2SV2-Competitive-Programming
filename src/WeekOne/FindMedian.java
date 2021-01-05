package WeekOne;

public class FindMedian {
    static int findMedian(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]] = count[arr[i]] + 1;

        }
        int index = 0;

        for (int i = 0; i < count.length; i++) {

            for (int j = 0; j < count[i]; j++) {
                arr[index] = i;
                index++;
            }
        }

        int median=arr.length/2;
        return arr[median];
    }
}
