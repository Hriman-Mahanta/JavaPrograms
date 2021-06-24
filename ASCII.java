//20. Program to find ASCII value of a character.
import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        char name;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a character: ");
        name=input.next().charAt(0);
        int ascii=name;
        System.out.println("The ASCII value is: "+ascii);
    }
}
