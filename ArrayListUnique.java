import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Program to print an arraylist of unique sorted elements.
public class ArrayListUnique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            int temp=input.nextInt();
            if (!numbers.contains(temp))
                numbers.add(temp);
        }
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}

