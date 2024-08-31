package objectPrograming;

public class reference {
    public static void main(String[] args) {
        int a = 53;
        int b = a;
        b = 30;
        System.out.println(b);
        System.out.println(a);
        Test x = new Test();//address not value
        Test y = x;
        System.out.println(y == x);
        y.a = 30;

        System.out.println(y.a);
        System.out.println(x.a);
        x.a = 10;
        System.out.println(x.a);
        System.out.println(y.a);
        String imie = "Arsdf";
        String imie2  = new String(imie);// that what string do
        imie2 = "new imie";
        System.out.println(imie);
    }
}

class Test{
    int a = 20;

}
