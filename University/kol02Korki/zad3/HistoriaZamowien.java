package University.kol02Korki.zad3;

import University.kol02Korki.zad01.Zamownienie;

import java.util.Iterator;

public class HistoriaZamowien implements Iterable<Zamownienie> {
    private Zamownienie[] zamownienies;

    public HistoriaZamowien(){
        zamownienies = new Zamownienie[100];
    }
    public HistoriaZamowien(Zamownienie[] zamownienies) {
        if(zamownienies.length > 100){
            this.zamownienies = new Zamownienie[100];
        }else {
            this.zamownienies = zamownienies;
        }
    }

    public Zamownienie[] getZamownienies() {
        return zamownienies;
    }

    public void setZamownienies(Zamownienie[] zamownienies) {
        this.zamownienies = zamownienies;
    }

    @Override
    public Iterator<Zamownienie> iterator() {
        return new IterotorZamowien(zamownienies);
    }
}
