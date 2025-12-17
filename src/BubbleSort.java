import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 14, 32, 2, 1 ,8,5,39,66,0,3};
        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swapping to right places
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}