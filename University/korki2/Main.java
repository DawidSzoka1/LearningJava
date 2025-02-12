package University.korki2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Element[] el = new Element[3];

        Element e1 = new Element("a");
        Element e2 = new Element("a");
        Element e3 = new Element("c");
        List<Element> lista = new ArrayList<>();

        e1.metoda();

        Collections.sort(lista);
        el[0] = e1;
        el[1] = e2;
        el[2] = e3;
        Tablica tab = new Tablica(el);
        Magazyn m = new Magazyn();
        m.metod();
        for(Element e: tab){
            System.out.println(e);
        }

    }
}
