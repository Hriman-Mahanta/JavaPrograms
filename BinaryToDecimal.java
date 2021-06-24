//9. Program to implement Binary To Decimal Conversion.
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int bin,i=0;
        double dec=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        bin=input.nextInt();
        while(bin!=0){
            dec=dec+(bin%10)*Math.pow(2,i);
            bin/=10;
            i++;
        }
        System.out.println("The decimal equivalent is: "+dec);
    }
}
