package University.kol02;

public class Pozycja implements Comparable<Pozycja>{
    private Product produkt;
    private int ilosc;

    public Pozycja(){}
    public Pozycja(Product produkt, int ilosc) {
        this.produkt = produkt;
        this.ilosc = ilosc;
    }

    public Double getWartosc(){
        return produkt.getCena() * ilosc;
    }
    public Product getProdukt() {
        return produkt;
    }

    public void setProdukt(Product produkt) {
        this.produkt = produkt;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    @Override
    public int compareTo(Pozycja o) {
        int roz = this.getWartosc().compareTo(o.getWartosc());

        return roz == 0 ? this.produkt.getName().compareTo(o.produkt.getName()) : -roz;
    }

    @Override
    public String toString() {
        return "Pozycja{" +
                "produkt=" + produkt +
                ", ilosc=" + ilosc +
                '}';
    }
}
