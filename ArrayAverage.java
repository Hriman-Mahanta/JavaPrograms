//4. Program to find average of an array.
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr=new int[20];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=input.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        int avg=sum/n;
        System.out.println("The average of the array is: "+avg);
    }
}
