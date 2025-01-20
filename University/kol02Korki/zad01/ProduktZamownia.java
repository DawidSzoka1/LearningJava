package University.kol02Korki.zad01;

public class ProduktZamownia implements Comparable<ProduktZamownia>{
    private Produkt p;
    private int ilosc;

    public ProduktZamownia(Produkt p, int ilosc) {
        this.p = p;
        this.ilosc = ilosc;
    }

    public Produkt getP() {
        return p;
    }

    public void setP(Produkt p) {
        this.p = p;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return "ProduktZamownia{" +
                "p=" + p +
                ", ilosc=" + ilosc +
                '}';
    }

    @Override
    public int compareTo(ProduktZamownia o) {
        return 0;
    }
}
