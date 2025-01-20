package University.kol02Korki.zad3;

import University.kol02Korki.zad01.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws WlasnyWyjatek {
        ProduktZamownia p1 = new ProduktZamownia(new Produkt("12", 1), 10);

        Zamownienie zamownienie1 = new Zamownienie();
        zamownienie1.add(p1);
        Zamownienie zamownienie2 = new Zamownienie();
        zamownienie2.add(new ProduktZamownia(new Produkt("p", 30), 3));
        HistoriaZamowien historiaZamowien = new HistoriaZamowien();
        historiaZamowien.getZamownienies()[0] = zamownienie1;
        historiaZamowien.getZamownienies()[1] = null;
        historiaZamowien.getZamownienies()[2] = zamownienie2;


        Iterator<Zamownienie> iterator = historiaZamowien.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
