package University.kol2v2.zad3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Slowo s1 = new Slowo("wyraz1");
        Slowo s2 = new Slowo("wyraz2");
        Slowo s3 = new Slowo("wyraz3");
        Slowo s4 = new Slowo("wyraz4");
        Slowo[] s = new Slowo[11];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        s[3] = s4;
        Slownik slownik = new Slownik(s);
        Iterator<Slowo> iterator = slownik.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
