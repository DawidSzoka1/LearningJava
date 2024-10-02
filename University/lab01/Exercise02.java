package University.lab01;

import java.util.Random;

public class Exercise02 {
    static boolean pal(String text){
        int i = 0;
        int j = text.length()-1;
        while(i < j){
            if(text.charAt(i) != text.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static boolean palUsingArray(String text){
        char[] words = text.toCharArray();
        int i = 0;
        int j = words.length-1;
        while(i < j){
            if(words[i] != words[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        int max = array[0];
        int min = array[0];
        for(int i: array){
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }
        System.out.println("Max = " + max + "\nMin = " + min);
        System.out.println(palUsingArray("zakaz"));
    }
}
