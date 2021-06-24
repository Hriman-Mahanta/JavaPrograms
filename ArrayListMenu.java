import java.util.ArrayList;
import java.util.Scanner;

// Program to create a menu program for an arraylist.
public class ArrayListMenu {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an option: ");
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        boolean flag = true;
        while (flag) {
            int n = input.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter number to add: ");
                    numbers.add(input.nextInt());
                    System.out.println("Added");
                    break;
                case 2:
                    System.out.print("Enter element to delete: ");
                    numbers.remove(input.nextInt());
                    System.out.println("Removed");
                    break;
                case 3:
                    System.out.println(numbers);
                    break;
                case 4:
                    flag = false;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
