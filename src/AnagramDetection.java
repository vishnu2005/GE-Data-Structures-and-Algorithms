import java.util.Hashtable;
import java.util.Scanner;

// ANAGRAM DETECTION
public class AnagramDetection {
    public static boolean isAnagram(String s1, String s2) {
        // base case: checking length is equal or not
        if (s1.length() != s2.length()) {
            return false;
        }

        Hashtable<Character, Integer> table = new Hashtable<>();
        for (char ch : s1.toCharArray()) {
            // if the ch is present then we get its frequency, if not we get defaultly 0
            table.put(ch, table.getOrDefault(ch, 0) + 1);
        }
        // Reducing frequency of s1 using s2
        for (char ch : s2.toCharArray()) {
            if (!table.containsKey(ch)) {
                return false; // char not present so NOT anagram
            }
            int count = table.get(ch) - 1;
            if (count < 0) {
                return false; // more occurrences in s2
            }
            table.put(ch, count); // updating with the new frequency value
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String s1 = sc.nextLine().toLowerCase();

        System.out.println("Enter the second string:");
        String s2 = sc.nextLine().toLowerCase();

        if (isAnagram(s1, s2)) {
            System.out.println("Strings "+s1+" and "+s2+" are Anagrams");
        } else {
            System.out.println("Strings "+s1+" and "+s2+" are NOT Anagrams");
        }
    }
}
