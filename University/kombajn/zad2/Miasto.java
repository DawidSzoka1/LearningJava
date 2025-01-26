package University.kombajn.zad2;

public class Miasto implements Comparable<Miasto> {
    private Liczba iloscM;
    private Nazwa nazwa;

    public Miasto(Liczba iloscM, Nazwa nazwa) {
        this.iloscM = iloscM;
        this.nazwa = nazwa;
    }

    public Liczba getIloscM() {
        return iloscM;
    }

    public void setIloscM(Liczba iloscM) {
        this.iloscM = iloscM;
    }

    public Nazwa getNazwaObiekt() {
        return nazwa;
    }

    public void setNazwa(Nazwa nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public int compareTo(Miasto o) {
        int poNazwa = -this.getNazwaObiekt().getNazwa().compareTo(o.getNazwaObiekt().getNazwa());
        if(poNazwa == 0){
            int poIlosc = (this.getIloscM().getIlosc() - o.getIloscM().getIlosc());
            return poIlosc;
        }
        return poNazwa;
    }

    @Override
    public String toString() {
        return "Miasto{" +
                "iloscM=" + iloscM +
                ", nazwa=" + nazwa +
                '}';
    }
}
