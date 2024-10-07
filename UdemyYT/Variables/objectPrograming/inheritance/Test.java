package UdemyYT.Variables.objectPrograming.inheritance;

public class Test {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child(2, 2, "ASdasd");
        c.display();
        p.display();
        Parent p2 = new Child();
        System.out.println("-----------------");
        p2.display();
    }
}
