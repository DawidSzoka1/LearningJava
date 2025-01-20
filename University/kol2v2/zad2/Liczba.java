package University.kol2v2.zad2;

public class Liczba {
    private int ilosc;

    public Liczba() {
    }

    public Liczba(int ilosc) {
        this.ilosc = ilosc;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return "Liczba{" +
                "ilosc=" + ilosc +
                '}';
    }
}
