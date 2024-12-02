package University.kolWT;

import java.util.Random;

public class ex03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[10];
        int sum = 0;
        for(int i = 0; i < tab.length; i++){
            tab[i] = rand.nextInt(4, 21);
            System.out.println(tab[i]);
            sum += tab[i];
        }

        for(int i = 0; i < tab.length; i++){
            if(sum/tab.length < tab[i]){
                System.out.println(tab[i]);
            }
        }


    }
}
