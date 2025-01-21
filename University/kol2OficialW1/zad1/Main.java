package University.kol2OficialW1.zad1;

import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws Exception {
        Miasto m = new Miasto("Krakow");
        Miasto m1 = new Miasto("Krqas");
        Miasto m2 = new Miasto("Adas");
        PanstwoMiasta pm = new PanstwoMiasta(m ,1000);
        PanstwoMiasta pm2 = new PanstwoMiasta(m1 ,100302);
        PanstwoMiasta pm3 = new PanstwoMiasta(m2 ,10002);
        Panstwo p = new Panstwo("Pdfg");
        Panstwo p2 = new Panstwo("ddfg");
        p.getMiasta().add(pm);
        p.getMiasta().add(pm2);
        p.getMiasta().add(pm3);
        Kontynent k = new Kontynent();
        k.getPanstwa().add(p);
        k.getPanstwa().add(p2);
        Iterator<Panstwo> iterator = k.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
