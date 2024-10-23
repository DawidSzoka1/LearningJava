package University.lab02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfPoints {
    private Point[] points;

    public ArrayOfPoints() {
    }

    public ArrayOfPoints(Point[] points) {
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public void getFromPosiotion(int position) {
        for (int i = 0; i < points.length; i++) {
            if (points[i].getPosiotion() == position) {
                System.out.println(points[i]);
            }
        }
    }

    public List<Point> getPointsList() {
        List<Point> pointsList = new ArrayList<Point>();
        for (int i = 0; i < points.length; i++) {
            if(points[i].getPosiotion() == 1)
                pointsList.add(points[i]);
        }
        return pointsList;
    }
    public Point longest(){
        Point l = points[0];
        for (int i = 1; i < points.length; i++) {
            if(points[i].length() > l.length()){
                l = points[i];
            }
        }
        return l;
    }

    @Override
    public String toString() {
        return "ArrayOfPoints{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
