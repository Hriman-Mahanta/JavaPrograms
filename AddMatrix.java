//6. Program to find sum of two matrices.
import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements of first array: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter elements of row " + (i + 1)+": ");
            for (int j = 0; j < 3; j++)
                A[i][j] = input.nextInt();
        }
        System.out.println("Enter the elements of second array: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter elements of row " + (i + 1)+": ");
            for (int j = 0; j < 3; j++)
                B[i][j] = input.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                C[i][j] = A[i][j] + B[i][j];
        }
        System.out.println("The resultant array is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(C[i][j] + "  ");
            System.out.println();
        }
    }
}
