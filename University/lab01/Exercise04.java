package University.lab01;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise04 {
    static int[] maxMinInInt(int n){
        int max = 1;
        int min = 9;
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++){
            int check = Integer.parseInt(String.valueOf(s.charAt(i)));
            if(max < check){
                max = check;
            }else if(min > check){
                min = check;
            }

        }
        int otherInd = 0;
        for(int i = 0; i < s.length(); i++){
            if(i != s.indexOf(Integer.toString(max)) && i != s.indexOf(Integer.toString(min))){
                otherInd = i;
            }
        }
        int other = Integer.parseInt(String.valueOf(s.charAt(otherInd)));
        int maxNum = max * 100 + other * 10 + min;
        int minNum = min * 100 + other * 10 + max;
        return new int[]{maxNum,minNum};
    }

    static int MinNum(int n){
        String toString = Integer.toString(n);
        char[] chars = toString.toCharArray();
        Arrays.sort(chars);
        toString = new String(chars);
        return Integer.parseInt(toString);
    }

    static int MaxNum(int n){
        String toString = Integer.toString(n);
        char[] chars = toString.toCharArray();
        Arrays.sort(chars);
        StringBuilder reverse = new StringBuilder(new String(chars));
        reverse.reverse();
        return Integer.parseInt(reverse.toString());
    }

    public static void main(String[] args) {

        System.out.println(MaxNum(142));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number between 111-999: ");
        int number = input.nextInt();
        while (number < 111 || number > 999) {
            System.out.print("Enter the number between 111-999: ");
            number = input.nextInt();
        }
        int[] maxMin = maxMinInInt(number);

        System.out.println(maxMin[0] + " " + maxMin[1]);
        int result = maxMin[0] - maxMin[1];
        while(result > 0){
            maxMin = maxMinInInt(result);
            System.out.println(maxMin[0] + " " + maxMin[1] + " " + result);
            result = maxMin[0] - maxMin[1];
        }
        
    }
}
