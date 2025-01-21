package University.kol2OficialW1.zad1;

import java.util.ArrayList;
import java.util.Iterator;

public class Kontynent implements Iterable<Panstwo> {
    ArrayList<Panstwo> panstwa;

    public Kontynent(){
        panstwa = new ArrayList<>();
    }
    public Kontynent(ArrayList<Panstwo> panstwa) {
        this.panstwa = panstwa;
    }

    public ArrayList<Panstwo> getPanstwa() {
        return panstwa;
    }

    public void setPanstwa(ArrayList<Panstwo> panstwa) {
        this.panstwa = panstwa;
    }

    public void srednia(){
        double sum = 0;
        for(Panstwo p: panstwa){
            for(PanstwoMiasta miasto: p.getMiasta()){
                sum += miasto.getIlosc();
            }
        }
        System.out.println(sum/panstwa.size());
    }
    @Override
    public Iterator<Panstwo> iterator() {
        return new IteratorPanstw(panstwa);
    }
}
