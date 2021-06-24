//43. Program to reverse a string using stack.
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name=input.nextLine();
        Stack stack=new Stack();
        for(int i=0;i<name.length();i++){
            stack.push(name.charAt(i));
        }
        System.out.print("The reversed string is: ");
        for(int i=0;i<name.length();i++){
            System.out.print(stack.pop());
        }
    }
}
