package University.kol01;

class A{
    String name;
    A(String name){
        this.name=name;
    }
    A(){}

    @Override
    public String toString() {
        return name;
    }
}

class B extends A{
    int number;
    B(String name, int number){
        super(name);
        this.number=number;
    }

    @Override
    public String toString() {
        return super.toString()+ ": " +number;
    }
}

class C extends B{
    double number2;
    C(String name, double number2, int number){
        super(name,number);
        this.number2=number2;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + number2;
    }
}

public class ex02 {
    public static void main(String[] args) {
        A[] a={
                new A("Ala"),
                new B("Ola", 5),
                new C("zosia", 3.5, 3)
            };
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        };
    }
}
