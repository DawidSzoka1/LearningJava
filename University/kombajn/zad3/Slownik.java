package University.kombajn.zad3;

import java.util.Iterator;

public class Slownik implements Iterable<Slowo>{
    private Slowo[] zdanie;

    public Slownik(){

    }
    public Slownik(Slowo[] zdanie) {
        this.zdanie = zdanie;
    }

    public Slowo[] getZdanie() {
        return zdanie;
    }

    public void setZdanie(Slowo[] zdanie) {
        this.zdanie = zdanie;
    }

    @Override
    public Iterator<Slowo> iterator() {
        return new IteratorSlownikow(getZdanie());
    }
}
