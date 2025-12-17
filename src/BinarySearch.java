import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch  {
    public static void main(String[] args) {
        //inputting the word list from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the word list:");
        int n = sc.nextInt();

        String[] wordList = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            wordList[i] = sc.next().toLowerCase();
        }
        //word to search:
        System.out.println("Enter the word to search:");
        String searchWord = sc.next();

        //sort the word list to use binary search
        Arrays.sort(wordList);
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int res=searchWord.compareTo(wordList[mid]);
            // res==0 -> word found
            // res<0  -> searchWord comes before middle word
            // res>0  -> searchWord comes after middle word

            if(res==0){
                System.out.println(wordList[mid]+" found at index "+mid);
                return;
            }
            else if(res>0){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println(searchWord+" not found");

    }
}