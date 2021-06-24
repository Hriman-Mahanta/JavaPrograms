//23. Program to generate a multiplication table.
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a =input.nextInt();
        System.out.println("The multiplication table is: ");
        for(int i=1;i<=10;i++){
            System.out.println("   "+a+" * "+i+"  =  "+a*i);
        }
    }
}
