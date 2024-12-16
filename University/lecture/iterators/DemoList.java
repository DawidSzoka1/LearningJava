package University.lecture.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList implements Iterable<Integer> {
    List<Integer> data = new ArrayList<>();

    class It implements Iterator<Integer> {
        int index;
        @Override
        public boolean hasNext() {
            return index < data.size();
        }

        @Override
        public Integer next() {
            return data.get(index++);
        }
    }


    @Override
    public Iterator<Integer> iterator() {
        return new It();
    }
}
