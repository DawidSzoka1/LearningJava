package tab;

import java.util.Arrays;

public class D1 {
    public static void main(String[] args) {

        int[] tab = new int[10];// maksymalnie 10 elementow int typ
        tab[0] = 20;
        tab[1] = 30;
        System.out.println(tab[1]);
        System.out.println(tab[0]);
        int[] tab2 = {4, 15, 1};
        System.out.println(Arrays.toString(tab2));
        System.out.println(tab2.length);
    }
}
