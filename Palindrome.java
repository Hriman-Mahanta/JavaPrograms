//2. Program to check Palindrome.
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        Stack stack=new Stack();
        for(int i=0;i<name.length();i++)
            stack.push(name.charAt(i));
        String reversed="";
        while(!stack.isEmpty())
            reversed=reversed+stack.pop();
        if(name.equals(reversed))
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string is not a palindrome");
    }
}
