package UdemyYT.Variables.objectPrograming;

public class ObjectClass {
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        Point p2 = new Point(2, 3);
        Object o = new Point(3, 2);
        System.out.println(p.equals(o));
        System.out.println(p.getClass());
        System.out.println(p.equals(p2));
        System.out.println(p);
    }
}


final class Point{ // can't be used to extend
    private int x, y;
    final double z;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
        z = 0.0;
    }
    final int getX() { // can't override this method
        return x;
    }
    int getY() {
        return y;
    }
    Point() {
        this.z = 0.0;
    }


    public boolean equals(Point p) {
        return this.x == p.getX() && this.y == p.getY();
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}