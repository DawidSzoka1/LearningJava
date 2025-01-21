package University.kol2OficialW1.zad1;

import java.util.List;

public class PanstwoMiasta implements Comparable<PanstwoMiasta> {
    private Miasto miasta;
    private int ilosc;

    public PanstwoMiasta(Miasto miasta, int ilosc) {
        this.miasta = miasta;
        if(ilosc < 0){
            throw new RuntimeException("MIeszkancow nie mzoe byc ujemna");
        }
        this.ilosc = ilosc;
    }

    public Miasto getMiasta() {
        return miasta;
    }

    public void setMiasta(Miasto miasta) {
        this.miasta = miasta;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return "PanstwoMiasta{" +
                "miasta=" + miasta +
                ", ilosc=" + ilosc +
                '}';
    }


    @Override
    public int compareTo(PanstwoMiasta o) {
        int compareNazwa = this.getMiasta().getNazwa().charAt(0) - o.getMiasta().getNazwa().charAt(0);
        if(compareNazwa == 0){
            return (int) -(this.getMiasta().ile() - o.getMiasta().ile());
        }
        return compareNazwa;
    }
}
