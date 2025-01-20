package University.kol2v2.zad1;

public class WlasnyWyjatek extends Exception {
    public WlasnyWyjatek(String message) {
        super(message);
    }
    public WlasnyWyjatek(String message, Zamowienie zamowienie){
        this(message);
        for(Produkt p: zamowienie.getProdukty()){
            p.setIlosc(p.getIlosc() - 1);
        }
    }
}
