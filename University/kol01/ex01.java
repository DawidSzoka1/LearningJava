package University.kol01;

import java.util.Arrays;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Object[] tab = new Object[10];
//        tab[0] = args[0];
//        tab[1] = args[1];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < tab.length; i++) {// i = 2
            Object o = input.nextLine();
            try{
                o = Integer.parseInt(o.toString());
            }catch(NumberFormatException _){

            }
            tab[i] = o;
        }
        System.out.println(Arrays.toString(tab));
        int count_s = 0;
        int count_n = 0;
        for(Object o : tab) {
            if(o instanceof Integer) {
                count_n++;
            }
            if(o instanceof String) {
                count_s++;
            }
        }
        System.out.println("Ilosc liczb " + count_n);
        System.out.println("Ilosc slow " + count_s);

    }
}
