package University.algorithms;


import java.util.Arrays;
import java.util.Random;


public class TimeWithSort {
    public static void main(String[] args) throws InterruptedException {

        double avg = 0;
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            int[] x = new int[4096];
            for(int j = 0; j < x.length; j++){
                x[j] = rand.nextInt(100);
            }
            long start = System.nanoTime();
            Arrays.sort(x);
            long end = System.nanoTime();
            double duration = (end - start) / 1000000.0;
            avg += duration;
            System.out.format("%3d. %.4f ms%n", i+1, duration);
        }
        System.out.format("avf: %.4f ms%n", avg/10);
    }
}

