//22. Program to check if a character is an alphabet.
import java.util.Scanner;


public class AlpahabetCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=input.next().charAt(0);
        int num=ch;
        if((num>=65&&num<=90)||(num>=97&&num<=122))
            System.out.println("The character is an alphabet");
        else
            System.out.println("The character is not an alphabet");
    }
}
