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
    public Mother add(Mother other){
        if(other.mother.length != mother.length){
            System.out.println("Nie da sie dodac");
            return new Mother(mother);
        }
        Mother added = new Mother(mother.length, mother[0].length);
        for(int i = 0; i < mother.length; i++){
            for(int j = 0; j < mother[i].length; j++){
                added.mother[i][j] = mother[i][j].add(other.mother[i][j]);
            }
        }
        return added;
    }
    public Mother subtract(Mother other){
        Mother m = new Mother(mother.length, mother[0].length);
        for(int i = 0; i < mother.length; i++){
            for(int j = 0; j < mother[i].length; j++){
                m.mother[i][j] = mother[i][j].substract(other.mother[i][j]);
            }
        }
        return m;
    }

    public void multiplayByScalar(double s){
        for(int i = 0; i < mother.length; i++){
            for(int j = 0; j < mother[i].length; j++){
                mother[i][j] = mother[i][j].multiplyByScalar(s);
            }
        }
    }

    public Mother multiplyByMoher(Mother other){
        if(other.mother[0].length != mother.length ){
            System.out.println("Nie da sie pomnozyc");
            return null;
        }
        Mother multiplied = new Mother(mother.length, other.mother[0].length);

        for(int i = 0; i < mother.length; i++){
            for(int x = 0; x < other.mother[0].length; x++){
                ImaginaryNumber temp = new ImaginaryNumber(0, 0);
                for(int j = 0; j < mother[0].length; j++){
                    temp = temp.add(mother[i][j].multiplyByIma(other.mother[j][x]));
                }
                multiplied.mother[i][x] = temp;
            }

        }
        return multiplied;
    }
}
