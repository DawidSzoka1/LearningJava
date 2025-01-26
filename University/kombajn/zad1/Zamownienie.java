package University.kombajn.zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zamownienie {
    private Produkt[] produkty;

    public Zamownienie(){
        produkty = new Produkt[100];
    }

    public Zamownienie(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public int iloscProdukt(){
        int suma = 0;
        for(Produkt p: this.getProdukty()){
            suma += p.getIlosc();
        }
        return suma;
    }

    public void sprawdzWartosc(){
        double sume = 0;
        for(Produkt p: this.getProdukty()){
            sume += p.getCena() * p.getIlosc();
        }
        if(sume > 100){
            for(Produkt p: this.getProdukty()){
                p.setIlosc(p.getIlosc() - 1);
            }
            throw new WlasnyWyjatek("Cena przekracza 100");
        }
    }

    public static List<String> tylkoNazwy(Zamownienie z, double start, double end){
        List<String> w = new ArrayList<>();
        for(Produkt p: z.getProdukty()){
            if(p.getCena() >= start && p.getCena() <= end){
                w.add(p.getNazwa());
            }
        }
        return w;
    }

    @Override
    public String toString() {
        return "Zamownienie{" +
                "produkty=" + Arrays.toString(produkty) +
                '}';
    }
}
