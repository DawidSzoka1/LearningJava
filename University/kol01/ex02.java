package University.kol01;

class A {
    private String name;

    public A() {
    }

    public A(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class B extends A {
    private int num;

    public B() {
        super();
    }

    public B(String name, int num) {
        super(name);
        this.num = num;
    }

    @Override
    public String toString() {
        return super.toString() + ": " + num;
    }
}

class C extends B {
    private double num2;

    public C() {
        super();
    }

    public C(String name, double num2, int num) {
        super(name, num);
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + num2;
    }
}

public class ex02 {
    public static void main(String[] args) {
        A[] a = {
                new A("Ala"),
                new B("Ola", 5),
                new C("Zosia", 3.5, 3)};
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
    }
}
