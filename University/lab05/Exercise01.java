package University.lab05;

import java.util.Random;

public class Exercise01 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] tab = new int[rand.nextInt(3,6)][];
        for(int i = 0; i < tab.length; i++){
            tab[i] = new int[rand.nextInt(3,6)];
        }
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                tab[i][j] = rand.nextInt(10);
            }
        }
        int longest = tab[0].length;
        for(int i = 0; i < tab.length; i++){
            if(tab[i].length > longest){
                longest = tab[i].length;
            }
        }
        int sum = 0;
        for(int i = 0; i < tab.length; i++){
            int temp = 0;
            for(int j = 0; j < tab[i].length; j++){
                temp += tab[i][j];
            }
            if(temp > sum){
                sum = temp;
            }
        }
        System.out.println("najwieszka suma " + sum);
        for(int i = 0; i < tab.length; i++){
            int temp = 0;
            for(int j = 0; j < tab[i].length; j++){
                temp += tab[i][j];
            }
            if(temp == sum){
                System.out.print('[');
                for(int j = 0; j < tab[i].length; j++){
                    System.out.print(tab[i][j] + " ");
                }
                System.out.println(']');
            }
        }
        System.out.println("Najdluzszy wiersz " + longest);
        for(int i = 0; i < tab.length; i++){
            if(tab[i].length == longest){
                System.out.print('[');
                for(int j = 0; j < tab[i].length; j++){
                    System.out.print(tab[i][j] + " ");
                }
                System.out.println(']');
            }
        }


    }
}
