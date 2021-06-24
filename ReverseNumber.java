//26. Program to reverse a number.
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        int reversed=0;
        while(num!=0){
            int temp=num%10;
            reversed=reversed*10+temp;
            num/=10;
        }
        System.out.print("The reversed number is: "+reversed);
    }
}
