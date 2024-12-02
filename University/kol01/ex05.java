package University.kol01;

import java.util.Random;

public class ex05 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[][] a = new int[5][];

        for(int i = 0; i < 5; i++) {
            a[i] = new int[rand.nextInt(5)];
        }

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = rand.nextInt(-3, 7);
            }
        }

        System.out.println(czy(a));

    }

     static boolean czy(int[][] m){
        int sumP = 0;
        int sumNP = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                if(m[i][j] % 2 == 0){
                    sumP += m[i][j];
                }
                else{
                    sumNP += m[i][j];
                }
            }
        }
//        if(sumP == sumNP){
//            return true;
//        }
//        else{
//            return false;
//        }
        return sumP == sumNP;
    }


}
