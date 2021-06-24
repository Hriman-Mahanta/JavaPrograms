//31. Program to print a pyramid using *.
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the height of pyramid: ");
        int n=input.nextInt();
        int k=0;
        for(int i=1;i<=n;i++){
            k=0;
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            while(k != 2 * i - 1) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }
    }
}
