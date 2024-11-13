package University.lab05;

import java.util.Random;

public class Mother {
    ImaginaryNumber[][] mother;

    Mother(){
        mother = new ImaginaryNumber[1][1];
    }
    Mother(ImaginaryNumber[][] mother){
        this.mother = mother;
    }
    Mother(int r, int c){
        mother = new ImaginaryNumber[r][c];
    }

    void fillIn(){
        Random rand = new Random();
        for(int i = 0; i < mother.length; i++){
            for(int j = 0; j < mother[i].length; j++){
                mother[i][j] = new ImaginaryNumber(rand.nextDouble(10), rand.nextDouble(10));
            }
        }
    }
}
