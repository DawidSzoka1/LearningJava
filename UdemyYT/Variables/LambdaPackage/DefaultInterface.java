package UdemyYT.Variables.LambdaPackage;

public class DefaultInterface {
    public static void main(String[] args) {
        A a = new A();
        a.method();
        Test t = new A();
        t.method();
    }
}


interface Test{

    default void method(){
        System.out.println("Test method default interface");
    }
}

class A implements Test{
    @Override
    public void method(){
        System.out.println("override method");
    }
}