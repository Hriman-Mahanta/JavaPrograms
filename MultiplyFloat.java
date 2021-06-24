//19. Program to multiply float numbers.
import java.util.Scanner;

public class MultiplyFloat {
    public static void main(String[] args) {
        float a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter two floating point numbers: ");
        a=input.nextFloat();
        b=input.nextFloat();
        c=a*b;
        System.out.println("The product is "+c);
    }
}
