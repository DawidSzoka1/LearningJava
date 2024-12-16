package University.lecture.iterators;

import java.util.*;

public class DemoIterator {
    public static void main(String[] args) {
        DemoList list = new DemoList();
        list.data.add(3);
        list.data.add(4);
        list.data.add(3);
        list.data.add(123);
        for(Integer i : list)
            System.out.println(i);
    }
}
