//24. Program to display fibonacci series.
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int f1=0,f2=1;
        System.out.print("Enter the number of terms: ");
        int n=input.nextInt();
        System.out.println("The Fibonacci series is: ");
        for(int i=0;i<n;i++){
            System.out.print(f1+"  ");
            int sum=f1+f2;
            f1=f2;
            f2=sum;
        }
    }
}
