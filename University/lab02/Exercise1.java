package University.lab02;

import java.util.Arrays;
import java.util.Random;

public class Exercise1 {
    static int[] permutation(int n){
        int[] list = new int[n];
        int[] per = new int[n];
        Random rand = new Random();
        int i = 0;
        while(i < n){
            int num = rand.nextInt(1,n+1);
            if(list[num-1] == 0){
                per[i] = num;
                list[num-1] = 1;
                i++;
            }
        }

        return per;
    }

    static int[] per2(int n){
        int[] list = new int[n];
        for(int i = 0; i < n; i++){
            list[i] = i + 1;
        }
        Random rand = new Random();
        int num, a;
        for(int i = 0; i < n; i++){
            num = rand.nextInt(n);
            a = list[i];
            list[i] = list[num];
            list[num] = a;
        }
        return list;
    }
    void hell(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        int[] test = per2(10);
        System.out.println(Arrays.toString(test));
        Exercise1 ex = new Exercise1();
        ex.hell();

    }
}
