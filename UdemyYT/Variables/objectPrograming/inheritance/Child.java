package UdemyYT.Variables.objectPrograming.inheritance;

public class Child extends Parent {
    String field;

    @Override
    void display() {
        super.display();
        System.out.println("Child Display");
        System.out.println(this.x + " " + this.y);
    }
    public Child(double x, double y, String field) {
        super(x, y);

        this.field = field;
        System.out.println("Child Constructor");
    }
    public Child(){
        System.out.println("Child Constructor");
    }
}
