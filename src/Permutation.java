import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation {
    public static void permute(String str, String ans, List<String> result) {
        // Base case
        if (str.length() == 0) {
            result.add(ans);
            return;
        }
        // take and not take method
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String l = str.substring(0, i);
            String r = str.substring(i + 1);
            permute(l + r, ans + ch, result);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        ArrayList<String> result = new ArrayList<>();
        permute(str, "", result);
        for(String s : result){
            System.out.println(s);
        }
    }
}
