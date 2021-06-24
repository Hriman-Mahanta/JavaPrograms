//8. Program to implement Binary Search.
import java.util.Scanner;

public class BinarySearch {
    static int[] A = {1, 6, 7, 21, 34, 54, 66, 78, 99};

    static int Binary(int i) {
        int l, beg = 0, end = A.length - 1, mid;
        mid = (beg + end) / 2;
        while (beg <= end && A[mid] != i) {
            if (i < A[mid])
                end = mid - 1;
            else
                beg = mid + 1;
            mid = (beg + end) / 2;
        }
        if (A[mid] == i)
            l = mid + 1;
        else
            l = -1;
        return l;
    }

    public static void main(String[] args) {
        int num, loc;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the item to search: ");
        num = input.nextInt();
        loc = Binary(num);
        if (loc == -1)
            System.out.println("The item is not present in the array");
        else
            System.out.println("The item is present in the location " + loc);
    }
}