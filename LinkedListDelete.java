//45. Program to delete multiple elements from a linked list.
import java.util.LinkedList;
public class LinkedListDelete {
            public static void main(String[] args) {
            LinkedList<String> lList = new LinkedList<String>();
            lList.add("1");
            lList.add("8");
            lList.add("6");
            lList.add("4");
            lList.add("5");
            System.out.println(lList);
            lList.subList(2, 4).clear();
            System.out.println(lList);
        }
    }
