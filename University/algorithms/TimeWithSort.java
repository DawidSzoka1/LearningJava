package University.algorithms;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TimeWithSort {
    public static void main(String[] args){
        int[] tab = {1, 2 ,4 , 5, 6, 7, 8, 54 , 4};
        long startTime = System.nanoTime();
        Arrays.sort(tab);
        long endTime = System.nanoTime();
        long result1 = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println(result1);
        Random rand = new Random();
        for(int i = 1; i < 30; i++){
            int[] tab2 = new int[i];
            for(int j = 0; j < i; j++){
                tab2[j] = rand.nextInt(100);
            }
            startTime = System.nanoTime();
            Arrays.sort(tab2);
            endTime = System.nanoTime();
            System.out.println(endTime - startTime);
        }
    }
}
