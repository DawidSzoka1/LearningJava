package UdemyYT.Variables.objectPrograming.inheritance;

public class Parent {
    double x = 10;
    double y = 9;

    void display() {
        System.out.println("Parent display");
    }
    public Parent() {
        System.out.println("Parent constructor");
    }
    public Parent(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("Parent constructor");
    }
}
