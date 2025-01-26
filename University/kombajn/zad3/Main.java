package University.kombajn.zad3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Slowo slowo = new Slowo("1");
        Slowo slowo2 = new Slowo("2");
        Slowo slowo3 = new Slowo("3");
        Slowo slowo4 = new Slowo("4");
        Slowo[] slowa = new Slowo[3];
        slowa[0] = slowo;
        slowa[1] = slowo2;
        slowa[2] = slowo3;
        Slownik s = new Slownik(slowa);
        Iterator<Slowo> iterator = s.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
