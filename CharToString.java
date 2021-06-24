//5. Program to convert character array to string.
import java.util.Scanner;
public class CharToString {
    public static void main(String[] args) {
        String string="";
        char[] arr=new char[20];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the character array: ");
        int n=input.nextInt();
        System.out.println("Enter the characters present in the array");
        for(int i=0;i<n;i++)
            arr[i]=input.next().charAt(0);
        for(int i=0;i<n;i++){
            string=string+arr[i];
        }
        System.out.println("The string is: "+string);
    }
}
