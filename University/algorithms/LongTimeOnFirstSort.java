package University.algorithms;

import java.util.Arrays;
import java.util.Random;

public class LongTimeOnFirstSort {
    public static void main(String[] args) {
        int[] firstIntArr = new int[10];
        int[] secondIntArr = new int[10];
        float[] firstFloatArr = new float[10];
        float[] secondFloatArr = new float[10];
        float[] thirdFloatArr = new float[10];
        float[] fourthFloatArr = new float[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            firstIntArr[i] = rand.nextInt(100);
            firstFloatArr[i] = rand.nextInt(100);
            secondIntArr[i] = rand.nextInt(100);
            secondFloatArr[i] = rand.nextInt(100);
            thirdFloatArr[i] = rand.nextInt(100);
            fourthFloatArr[i] = rand.nextInt(100);
        }
        int[] temp = Arrays.copyOf(firstIntArr, firstIntArr.length);

        long start = System.nanoTime();
        Arrays.sort(firstIntArr);
        long end = System.nanoTime();
        System.out.println("First int sort: " + (end - start));

        start = System.nanoTime();
        Arrays.sort(temp);
        end = System.nanoTime();
        System.out.println("Second int sort: " + (end - start));

        start = System.nanoTime();
        Arrays.sort(secondIntArr);
        end = System.nanoTime();
        System.out.println("Third int sort: " + (end - start));

        start = System.nanoTime();
        Arrays.sort(firstFloatArr);
        end = System.nanoTime();
        System.out.println("First float sort: " + (end - start));

        start = System.nanoTime();
        Arrays.sort(secondFloatArr);
        end = System.nanoTime();
        System.out.println("Second float sort: " + (end - start));

        start = System.nanoTime();
        Arrays.compare(firstFloatArr, secondFloatArr);
        end = System.nanoTime();
        System.out.println("First float compare: " + (end - start));

        start = System.nanoTime();
        Arrays.compare(thirdFloatArr, fourthFloatArr);
        end = System.nanoTime();
        System.out.println("Second float compare: " + (end - start));

        start = System.nanoTime();
        Arrays.compare(firstFloatArr, secondFloatArr);
        end = System.nanoTime();
        System.out.println("Third float compare: " + (end - start));
    }
}
