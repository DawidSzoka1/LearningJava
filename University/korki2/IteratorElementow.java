package University.korki2;

import java.util.Iterator;

public class IteratorElementow implements Iterator<Element> {
    int cursor;
    Element[] tablica;
    public IteratorElementow(Element[] e){
        cursor = e.length - 1;
        tablica = e;
    }
    @Override
    public boolean hasNext() {
        return cursor >= 0;
    }

    @Override
    public Element next() {
        return tablica[cursor--];
    }
}
