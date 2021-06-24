//25. Program to count number of digits in an integer.
import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num=input.nextInt();
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        System.out.print("The number of digits is: "+count);
    }
}
