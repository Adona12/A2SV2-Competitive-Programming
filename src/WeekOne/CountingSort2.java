package WeekOne;

public class CountingSort2 {
    public static void countingSort2(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int[] count;
        if (min < 0) {
            count = new int[max + (-1 * (min)) + 1];
        } else {
            count = new int[max + 1];
        }

        int[] sorted = new int[arr.length];
        int negativeStart = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count[arr[i]]++;
            } else {
                if (min == arr[i] && negativeStart == 0) {
                    negativeStart = count.length + arr[i];
                }

                count[count.length + arr[i]]++;
            }
        }
        int index = 0;
        if (negativeStart > 0) {
            for (int i = negativeStart; i < count.length; i++) {
                for (int j = 0; j < count[i]; j++) {
                    sorted[index] = i - count.length;
                    index++;
                }
            }
            for (int i = 0; i < (negativeStart == 0 ? count.length : negativeStart); i++) {

                for (int j = 0; j < count[i]; j++) {
                    sorted[index] = i;
                    index++;
                }
            }
            for (int i = 0; i < sorted.length; i++) {
                System.out.println(sorted[i]);
            }
        }

    }
}
