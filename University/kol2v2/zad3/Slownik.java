package University.kol2v2.zad3;

import java.util.Arrays;
import java.util.Iterator;

public class Slownik implements Iterable<Slowo>{
    private Slowo[] zdanie;

    public Slownik() {
        zdanie = new Slowo[100];
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
    public String toString() {
        return "Slownik{" +
                "zdanie=" + Arrays.toString(zdanie) +
                '}';
    }

    @Override
    public Iterator<Slowo> iterator() {
        return new SlownikIterator(zdanie);
    }
}
