package array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTask1 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(100);
        list.add(100.50);
        list.add("Hello");
        list.add(true);
        list.add("World");

        // remove -> Hello & World using iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Object obj = itr.next();
            if (obj instanceof String) {
                itr.remove();
            }
        }

        // print final list
        System.out.println(list);
    }
}
