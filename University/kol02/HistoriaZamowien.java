package University.kol02;

import java.util.Arrays;
import java.util.Iterator;

public class HistoriaZamowien implements Iterable<Zamowienie> {
    private Zamowienie[] zamowienia;
    public  HistoriaZamowien(){
        zamowienia = new Zamowienie[100];
    }

    public void addZamowienie(Zamowienie z){
        int i = 0;
        while(zamowienia[i] != null && i < 100){
            i++;
        }
        if(i < 100){
            zamowienia[i] = z;
        }
    }

    @Override
    public String toString() {
        return "HistoriaZamowien{" +
                "zamowienia=" + Arrays.toString(zamowienia) +
                '}';
    }

    @Override
    public Iterator<Zamowienie> iterator() {
        return new IteratorHistoria(zamowienia);
    }
}
