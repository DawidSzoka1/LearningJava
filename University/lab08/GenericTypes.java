package University.lab08;


import University.lab02.Point;
import University.lab08.ex01.KlasaA;
import University.lab08.ex01.KlasaB;

public class GenericTypes {
    public static void main(String[] args) {
        KlasaA<Integer> a = new KlasaA<>(3);
        Integer[] ar = new Integer[3];
        ar[0] = 5;
        KlasaA<Point> p = new KlasaA<>(new Point(3, 4));
        KlasaB<Integer> b = new KlasaB<>(ar);
        Point[] ar2 = new Point[3];
        ar2[0] = new Point(1, 2);
        ar2[1] = p.getVariable();
        KlasaB<Point> b2 = new KlasaB<>(ar2);
        System.out.println(b.isAIn(a));
        System.out.println(b2.isAIn(new KlasaA<>( new Point(3,  4))));
    }
}
