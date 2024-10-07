package UdemyYT.Variables;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(6) + 1;
        System.out.println(x);
        double y = rand.nextDouble();//between 0 and 1
        System.out.println(y);
        boolean z = rand.nextBoolean();//true or false
        System.out.println(z);


    }
}
