package University.lab06;

import java.util.Comparator;

public class CompareOsobav2 implements Comparator<Osoba> {
    @Override
    public int compare(Osoba o1, Osoba o2) {
        if (o1.getW().getIle() == o2.getW().getIle()) {
            return -1 * o1.getN().getNazwa().compareTo(o2.getN().getNazwa());
        }
        return -1 * Integer.compare(o1.getW().getIle(), o2.getW().getIle());
    }
}
