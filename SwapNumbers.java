//21. Program to swap two numbers.
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=input.nextInt();
        System.out.print("Enter second number: ");
        int b=input.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The first number is: "+a);
        System.out.println("The second number is: "+b);
    }
}
