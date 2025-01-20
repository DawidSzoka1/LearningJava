package University.kol2v2.zad2;

public class Miasto implements Comparable<Miasto> {
    private Liczba iloscM;
    private Nazwa nazwa;

    public Miasto() {
    }

    public Miasto(Liczba iloscM, Nazwa nazwa) {
        this.iloscM = iloscM;
        this.nazwa = nazwa;
    }

    public Liczba getIloscM() {
        return iloscM;
    }

    public Nazwa getNazwa() {
        return nazwa;
    }

    public void setNazwa(Nazwa nazwa) {
        this.nazwa = nazwa;
    }

    public void setIloscM(Liczba iloscM) {
        this.iloscM = iloscM;
    }

    @Override
    public int compareTo(Miasto o) {
        int compareNazwa = o.getNazwa().getNazwa().compareTo(this.getNazwa().getNazwa());
        if(compareNazwa == 0){
            return o.getIloscM().getIlosc() - this.getIloscM().getIlosc();
        }
        return -compareNazwa;
    }

    @Override
    public String toString() {
        return "Miasto{" +
                "iloscM=" + iloscM +
                ", nazwa=" + nazwa +
                '}';
    }
}
