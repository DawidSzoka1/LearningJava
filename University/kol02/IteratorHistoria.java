package University.kol02;

import java.util.Iterator;

public class IteratorHistoria implements Iterator<Zamowienie> {
    int cursor = 0;
    Zamowienie[] zamowienia;
    public IteratorHistoria(Zamowienie[] z){
        zamowienia = z;
    }

    @Override
    public boolean hasNext() {
        while (cursor < zamowienia.length && zamowienia[cursor] != null && zamowienia[cursor].ilePlacic() <= 25) {
            cursor ++;
        }
        return cursor < zamowienia.length && zamowienia[cursor] != null;
    }

    @Override
    public Zamowienie next() {
        return zamowienia[cursor++];
    }
}
