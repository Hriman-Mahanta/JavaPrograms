//3. Program to find occurrence of a character in a string.
import java.util.Scanner;


public class Character {
    public static void main(String[] args) {
        char character;
        String string;
        int flag=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string: ");
        string=input.nextLine();
        System.out.println("Enter a character: ");
        character=input.next().charAt(0);
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)==character){
                System.out.println("Character found at position: "+(i+1));
                flag=1;
            }
        }
        if(flag==0)
            System.out.println("The character is not present in the string");
    }
}
