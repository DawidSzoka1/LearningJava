package University.kol2v2.zad1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produkt p1 = new Produkt("Sperma", 100, 20);
        Produkt p2 = new Produkt("dildo", 200, 1);
        Produkt p3 = new Produkt("fsdf", 23, 2);
        Produkt p4 = new Produkt("asd", 321, 3);
        Produkt[] produkty = new Produkt[4];
        produkty[0] = p1;
        produkty[1] = p2;
        produkty[2] = p3;
        produkty[3] = p4;
        Zamowienie zamowienie = new Zamowienie(produkty);
        Produkt[] produkty2 = new Produkt[2];
        produkty2[0] = p1;
        produkty2[1] = p2;
        Zamowienie zamowienie2 = new Zamowienie(produkty2);
        ArrayList<Zamowienie> zamowienia = new ArrayList<>();
        zamowienia.add(zamowienie);
        zamowienia.add(zamowienie2);
        HisoriaZam hisoriaZam = new HisoriaZam(zamowienia);
        System.out.println(HisoriaZam.najmniejszaIloscProduktow(hisoriaZam));
//        System.out.println(zamowienie.produktyDrozsze(199, 321));
        try {
            zamowienie.sprawdz();
        }catch (WlasnyWyjatek e){
            System.out.println(e.getMessage());
        }
    }
}
