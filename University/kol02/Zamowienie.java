package University.kol02;

import java.util.*;

public class Zamowienie{
    private List<Pozycja> produkty;

    public List<Pozycja> getProdukty() {
        return produkty;
    }

    public void setProdukty(List<Pozycja> produkty) {
        this.produkty = produkty;
    }

    public Zamowienie(){
        produkty = new ArrayList<>();
    }
    public Zamowienie(List<Pozycja> produkty) {
        this.produkty = produkty;
    }
    public void dodajProdukt(Product p, int ilosc){
//        if(ilosc < 0){
//            throw new UjemnaIlosc("Ilosc musi byc dodatnia");
//        }
//        if(ilePlacic() > 100 ){
//            throw new RuntimeException("Cena za duza");
//        }
        produkty.add(new Pozycja(p, ilosc));
    }

    public double ilePlacic(){
        double sum = 0;
        for(Pozycja p: produkty){
            sum += p.getWartosc();
        }
        return  sum;
    }

    @Override
    public String toString() {
        return
                "produkty=" + produkty +
                '}';
    }
}
