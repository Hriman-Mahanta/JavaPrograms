//35. Program to convert an array to a list.
import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5};
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<A.length;i++){
            list.add(A[i]);
        }
        System.out.println(list);
    }
}
