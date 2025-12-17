import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = { 5, 14, 32, 2, 1, 8, 5, 39, 66, 0, 3 };
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                // swapping
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}
