package University.lab06;

import java.util.ArrayList;
import java.util.Collections;

public class Osoba implements Comparable<Osoba> {
    private Nazwa n;
    private Wzrost w;
    public Osoba(){}
    public Osoba(String nazwa, int ile) {
        this.n = new Nazwa(nazwa);
        this.w = new Wzrost(ile);
    }

    public Nazwa getN() {
        return n;
    }

    public void setN(Nazwa n) {
        this.n = n;
    }

    public Wzrost getW() {
        return w;
    }

    public void setW(Wzrost w) {
        this.w = w;
    }

    @Override
    public int compareTo(Osoba o) {
        if(this.w.getIle() == o.getW().getIle()){
            return this.n.getNazwa().compareTo(o.getN().getNazwa());
        }
        return Integer.compare(this.w.getIle(), o.getW().getIle());
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "n=" + n.getNazwa() +
                ", w=" + w.getIle() +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Osoba> osoby = new ArrayList<>();
        CompareOsobav2 compare = new CompareOsobav2();
        osoby.add(new Osoba("Sam", 1));
        osoby.add(new Osoba("Amam", 1));
        osoby.add(new Osoba("Sam", 3));
        osoby.add(new Osoba("Marek", 4));
//        osoby.sort(Osoba::compareTo);
        osoby.sort(compare);
        System.out.println(osoby);

    }
}
