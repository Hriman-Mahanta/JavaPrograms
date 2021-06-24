//29. Program to convert decimal to binary.
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int dec=input.nextInt();
        int bin=0,i=0;
        int[] temp=new int[20];
        while(dec!=0){
            temp[i]=dec%2;
            bin=bin*10+temp[i];
            dec/=2;
            i++;
        }
        System.out.print("The binary equivalent is: ");
        for (int j=i-1;j>=0;j--){
            System.out.print(temp[j]);
        }

    }
}
