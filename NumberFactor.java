//27. Program to find the factors of a number.
import java.util.Scanner;

public class NumberFactor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        System.out.print("The factors are: ");
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
                System.out.print(i+"  ");
        }
    }
}
