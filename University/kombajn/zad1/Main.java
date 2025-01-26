package University.kombajn.zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produkt p = new Produkt();
        Produkt p2 = new Produkt();
        Produkt[] produkts = new Produkt[2];
        produkts[0] = p;
        produkts[1] = p2;
        Zamownienie z = new Zamownienie(produkts);
        List<Zamownienie> sad = new ArrayList<>();
        sad.add(z);
        HistoriaZam historiaZam = new HistoriaZam(sad);

    }
}
