import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class PrimeAnagramPalindrome
{

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

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

    public static boolean isPalindrome(String s) {
        int n = s.length();
        if (n == 0) return true;
        if (n == 1) return true;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        int[] arr=new int[180];
        int j=0;
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                arr[j]=i;
                j++;
            }
        }
        Arrays.sort(arr);
        System.out.println("Anagram Prime numbers between 0 and 1000:");
        for(int i=0;i<180;i++){
            for(int k=i+1;k<180;k++){
                if(isAnagram(Integer.toString(arr[i]),Integer.toString(arr[k]))){
                    System.out.println("["+arr[i]+" , "+arr[k]+"]");
                }
            }
        }
        System.out.println("\n Palindrome Prime numbers between 0 and 1000:");
        for(int i=0;i<180;i++){
            if(isPalindrome(Integer.toString(arr[i]))){
                System.out.println(arr[i]);
            }
        }

    }
}