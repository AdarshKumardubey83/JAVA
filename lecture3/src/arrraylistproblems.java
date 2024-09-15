import java.util.ArrayList;
import java.util.Collections;
public class arrraylistproblems {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(4);
        System.out.println("Original List"+list);
        Collections.reverse(list);
        System.out.println("Reverse List"+list);

    }
}
