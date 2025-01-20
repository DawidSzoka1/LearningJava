package University.kol2v2.zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zamowienie {
    private Produkt[] produkty;

    public Zamowienie() {
        produkty = new Produkt[100];
    }

    public Zamowienie(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public List<Produkt> produktyDrozsze(double low, double high) {
        ArrayList<Produkt> wyniki = new ArrayList<>();
        for (int i = 0; i < produkty.length && produkty[i] != null; i++) {
            if (produkty[i].getCena() >= low && produkty[i].getCena() <= high) {
                wyniki.add(produkty[i]);
            }
        }

        return wyniki;
    }

    public void sprawdz() throws WlasnyWyjatek {
        double suma = 0;
        for (Produkt p : produkty) {
            suma += p.getCena() * p.getIlosc();
        }
        if (suma > 100) {
            for (Produkt p : produkty) {
                if (p.getIlosc() > 0) {
                    p.setIlosc(p.getIlosc() - 1);
                }
            }
            throw new WlasnyWyjatek("Cena zamowienia jest wieksza od 100");
        }
    }

    public int iloscProduktow() {
        int suma = 0;
        for (Produkt p : produkty) {
            suma += p.getIlosc();
        }
        return suma;
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "produkty=" + Arrays.toString(produkty) +
                '}';
    }
}
