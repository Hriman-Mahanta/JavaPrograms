//10. Program to make a calculator.
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a,b;
        float res=0;
        char op;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter first number: ");
        a=input.nextInt();
        System.out.print("Enter an operator: ");
        op=input.next().charAt(0);
        System.out.print("Enter second number: ");
        b=input.nextInt();
        switch(op){
            case '+':
                res=a+b;
                break;
            case '-':
                res=a-b;
                break;
            case '*':
                res=a*b;
                break;
            case '/':
                res=a/b;
                break;
            default:
                System.out.println("Invalid Operator");
        }
        System.out.println("The result is: "+res);
    }
}
