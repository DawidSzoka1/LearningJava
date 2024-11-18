package University.lab06;

import University.lab02.Point;

import java.util.*;

import static java.lang.Math.pow;

public class ex02 {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            points.add(new Point((int) (i*pow(-1,i)),i *(int)pow(-1, i+1)));
        }
        points.add(new Point(0,0));
        points.add(new Point(0,5));
        points.add(new Point(1,3));
        Collections.sort(points);
        System.out.println(points);
        Point sumPoints = new Point(0, 0);
        Iterator<Point> iterator = points.iterator();
        while(iterator.hasNext()){
            sumPoints = sumPoints.add(iterator.next());
        }
        System.out.println(sumPoints);
        sumPoints = new Point(0, 0);
        for(int i = 0; i < points.size(); i++){
            sumPoints = sumPoints.add(points.get(i));
        }
        System.out.println(sumPoints);

//        Iterator<Point> iterator2 = points.iterator();
//        while(iterator2.hasNext()){
//            Point p1 = iterator2.next();
//            if(p1.getPosiotion() != 1){
//                iterator2.remove();
//            }
//        }
//        if(points.size() > 2) {
//            points.set(points.size() - 2, new Point(0, 0));
//        }

        Set<Point> setPx = new TreeSet<>(points);
//        Set<Point> setPy = new TreeSet<>(points);
//        Set<Point> setP = new TreeSet<>();
//        setPx.addAll(points);
//        System.out.println(setPx);
        System.out.println(setPx);


    }
}
