package University.kombajn.zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Miasto m = new Miasto(new Liczba(2323), new Nazwa("Naz1"));
        Miasto m2 = new Miasto(new Liczba(1000), new Nazwa("Naz1"));
        Miasto m3 = new Miasto(new Liczba(2323), new Nazwa("Ab"));
        List<Miasto> miasta = new ArrayList<>();
        miasta.add(m);
        miasta.add(m2);
        miasta.add(m3);
//        miasta.sort(new ComparatorMiast());
        Collections.sort(miasta);
        System.out.println(miasta);
    }
}
