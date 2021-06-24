//48. Program to shuffle a list.
import java.util.ArrayList;
import java.util.Collections;

public class ListShuffle {
    public static void main(String[] argv) throws Exception {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("A");
        obj.add("E");
        obj.add("I");
        obj.add("O");
        obj.add("U");
        Collections.shuffle(obj);
        System.out.println(obj);
    }
}
