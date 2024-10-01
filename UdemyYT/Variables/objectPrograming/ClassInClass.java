package UdemyYT.Variables.objectPrograming;

public class ClassInClass {

    public static void main(String[] args) {
        A a = new A();

        A.B varibleName =  a.new B();
        A.C varib = new A.C();
    }
}

class A{

    private int test;
    A(){
        System.out.println("A");
    }
    class B{
        private int testB;
        B(){
            System.out.println("B");
        }
        void display(){
            System.out.println(test);
        }
    }
    static class C{
        C(){
            System.out.println("C");
        }
    }
    void dis(){
//        System.out.println(testB); // can't do that
        B b = new B();
        b.display();
        System.out.println(b.testB);
    }
}
