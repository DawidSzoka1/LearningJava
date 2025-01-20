package University.kol2v2.zad1;

import java.util.ArrayList;
import java.util.List;

public class HisoriaZam {
    List<Zamowienie> zamowienia;

    public HisoriaZam() {
        zamowienia = new ArrayList<>();
    }

    public HisoriaZam(List<Zamowienie> zamowienia) {
        this.zamowienia = zamowienia;
    }

    public List<Zamowienie> getZamowienia() {
        return zamowienia;
    }

    public void setZamowienia(List<Zamowienie> zamowienia) {
        this.zamowienia = zamowienia;
    }

    public static Zamowienie najmniejszaIloscProduktow(HisoriaZam hisoriaZam){
        Zamowienie zamowienie = hisoriaZam.getZamowienia().getFirst();
        int iloscMin = zamowienie.iloscProduktow();
        List<Zamowienie> zamowienia = hisoriaZam.getZamowienia();
        int aktualnaIlosc = 0;
        for(Zamowienie z: zamowienia){
            aktualnaIlosc += z.iloscProduktow();
            if(aktualnaIlosc < iloscMin){
                iloscMin = aktualnaIlosc;
                zamowienie = z;
            }
            aktualnaIlosc = 0;
        }

        return zamowienie;

    }
}
