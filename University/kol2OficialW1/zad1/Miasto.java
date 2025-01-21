package University.kol2OficialW1.zad1;

import University.kol02Korki.zad01.WlasnyWyjatek;

import java.util.Arrays;
import java.util.Random;

public class Miasto {
    private String nazwa;
    private int[] tab = new int[5];

    public Miasto() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            tab[i] = random.nextInt(1, 31);
        }
    }

    public Miasto(String nazwa) throws Exception {
        if(nazwa.length() < 4){
            throw new Exception("dluzszy niz 4 i chuj");
        }
        this.nazwa = nazwa;
//        this.tab = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            tab[i] = random.nextInt(1, 31);
        }
    }

    public double ile() {
        double sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        return sum / tab.length;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int[] getTab() {
        return tab;
    }

    public void setTab(int[] tab) {
        this.tab = tab;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        String w = nazwa + " : " + this.ile();
//        for(int i = 0; i < tab.length; i++){
//            w += i != tab.length -1 ? tab[i] + ",": tab[i] + ";" ;
//        }
        return w;
    }
}
