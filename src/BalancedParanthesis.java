import java.util.Scanner;

public class BalancedParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression: ");
        String expression= sc.nextLine();
        if(Balanced(expression)){
            System.out.println("The expression is balanced.");
        }
        else {
            System.out.println("The expression is not balanced.");
        }
    }
    public static boolean Balanced(String exp){
        Stack stack=new Stack(exp.length());
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }
            else if (ch==')' || ch=='}' || ch==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top= stack.pop();
                if((ch==')' && top!='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')){
                    return false;
                }
            }
            else{
                continue;
            }
        }
        return stack.isEmpty();
    }
}