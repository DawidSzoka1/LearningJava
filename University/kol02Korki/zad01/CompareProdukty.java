package University.kol02Korki.zad01;

import java.util.Comparator;

public class CompareProdukty implements Comparator<ProduktZamownia> {
    @Override
    public int compare(ProduktZamownia o1, ProduktZamownia o2) {
        double wartosc1 = o1.getIlosc();
        double wartosc2 = o2.getIlosc();
        if(wartosc1 == wartosc2){
            return o1.getP().getNazwa().length() > o2.getP().getNazwa().length() ? 1 : -1;
        }
        return (int)(wartosc1 - wartosc2);
    }
}
