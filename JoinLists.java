//34. Program to join two lists.
import java.util.ArrayList;
import java.util.List;


public class JoinLists {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<String>();
        List<String> list2=new ArrayList<String>();
        list1.add("a");
        list2.add("b");
        List<String> list3=new ArrayList<String>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);
    }
}
