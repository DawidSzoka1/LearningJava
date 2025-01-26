package University.kombajn.zad4;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Lek lek = new Lek("a");
        Lek lek2 = new Lek("b");
        LekRef lek3 = new LekRef("a", 10);
        LekRef lek4 = new LekRef("a", 4);
        Apteka apteka = new Apteka();
        apteka.getLeki().add(lek);
        apteka.getLeki().add(lek2);
        apteka.getLeki().add(lek3);
        apteka.getLeki().add(lek4);
        Collections.sort(apteka.getLeki());
        System.out.println(apteka.getLeki());
    }
}
