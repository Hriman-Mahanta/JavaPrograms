//41. Program to display first and last element of a linked list.
import java.util.LinkedList;
public class LinkedListFirstLast {
        public static void main(String[] args) {
            LinkedList<String> lList = new LinkedList<String>();
            lList.add("100");
            lList.add("200");
            lList.add("300");
            lList.add("400");
            lList.add("500");
            System.out.println("First element of LinkedList is : " + lList.getFirst());
            System.out.println("Last element of LinkedList is : " + lList.getLast());
        }
    }

