package University.lab02;

import java.util.Arrays;
import java.util.Random;

public class Point{
    private int x, y;

    public Point() {}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() +  ')';
    }
    void wypisz(){
        System.out.println("("+ this.getX() + "," + this.getY() + ")");
    }
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        p1.wypisz();
        System.out.println(p1);
        Point[] points = new Point[10];
        Random rand = new Random();
        for(int i = 0; i < points.length; i++){
            points[i] = new Point(rand.nextInt(2), rand.nextInt(2));
//            System.out.println(points[i]);
        }
//        System.out.println(Arrays.toString(points));

        Odcinek[] o = new Odcinek[10];
        for(int i = 0; i < o.length; i++){
            o[i] = new Odcinek(points[i], points[rand.nextInt(points.length)]);
        }
        Odcinek[] max = Odcinek.maxLenght(o);
        System.out.println(Arrays.toString(max));

    }
}


