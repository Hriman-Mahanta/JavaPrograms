//28. Program to find sum of natural numbers using recursion.
import java.util.Scanner;

public class SumRecursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();
        int sum=recursivesum(num);
        System.out.println("The sum is: "+sum);
    }
    public static int recursivesum(int i){
        if(i!=0){
            return i+recursivesum(i-1);
        }
        else
            return i;
    }
}
