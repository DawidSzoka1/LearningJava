package University.kol02Korki.zad01;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Produkt p1 = new Produkt("sdf", 2);
        Produkt p2 = new Produkt("sdf", 4);
        Produkt p3 = new Produkt("afsdf", 2);
        ProduktZamownia pz1 = new ProduktZamownia(p1, 3);
        ProduktZamownia pz2 = new ProduktZamownia(p2, 3);
        ProduktZamownia pz3 = new ProduktZamownia(p3, 3);
        ArrayList<ProduktZamownia> sd = new ArrayList<>();
        sd.add(pz1);
        sd.add(pz2);
        sd.add(pz3);
        Zamownienie z = new Zamownienie(sd);

        z.getProdukty().sort(new CompareProdukty());
        
        Collections.sort(z.getProdukty());

        System.out.println(z);

    }
}
