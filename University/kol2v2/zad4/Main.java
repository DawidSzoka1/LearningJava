package University.kol2v2.zad4;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Lek l1 = new Lek("leka");
        Lek l2 = new Lek("lek");
        LekRef lr1 = new LekRef("lek", 10);
        Lek lr2 = new LekRef("lek", 20);
        ArrayList<Lek> leki = new ArrayList<>();
        leki.add(l1);
        leki.add(l2);
        leki.add(lr1);
        leki.add(lr2);
        Apteka a = new Apteka(leki);
        a.getLeki().sort(new PrownajLeki());
        System.out.println(a);
    }
}
