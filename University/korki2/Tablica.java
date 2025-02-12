package University.korki2;

import java.util.Iterator;
import java.util.TreeSet;

public class Tablica implements Iterable<Element>{
    Element[] elementy ;

    public Tablica(Element[] elementy) {
        this.elementy = elementy;
    }

    public Element[] getElementy() {
        return elementy;
    }

    public void setElementy(Element[] elementy) {
        this.elementy = elementy;
    }

    @Override
    public Iterator<Element> iterator() {
        return new IteratorElementow(elementy);
    }
}
