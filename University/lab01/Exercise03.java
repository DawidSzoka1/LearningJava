package University.lab01;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        int[] fib = new int[Integer.parseInt(args[0])];
        for (int i = 0; i < fib.length; i++) {
            if(i < 2){
                fib[i] = 1;
            }else{

                fib[i] = fib[i-1] + fib[i-2];
            }
        }
        System.out.println(Arrays.toString(fib));
        int sum = 0;
        for(String s: args){
            sum += Integer.parseInt(s);
        }
        System.out.println("sum of all numbers: " + sum);
    }
}
