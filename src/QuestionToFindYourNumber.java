import java.util.Scanner;

public class QuestionToFindYourNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number(n -> 2^n) to find your number: ");
        int n = sc.nextInt();
        int N=1<<n; //2^n

        System.out.println("-------------Pick a number between 0 and " + (N-1)+"-----------------");
        int low=0;
        int high=N-1;
        while(low<high){
            int mid=(low+high)/2;
            System.out.print("Is your number <= "+mid+" ?(true/false):");
            boolean ans=sc.nextBoolean();
            if(ans==true){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }

        System.out.println("Your number is "+low);

    }
}