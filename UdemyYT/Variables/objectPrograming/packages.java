package UdemyYT.Variables.objectPrograming;


public class packages {// public allows to import from difrent package
    public static int  y = 5;
    private static int pri = 10;
    void hello(){
        System.out.println("hello");
        System.out.println(pri);
    }
    public static void main(String[] args) {
        int x = 5;// only to use in this package
        System.out.println(pri);

    }
}
// access in this package
class toImportTest{
    void wypisz(){
        System.out.println("wypisz");
    }
}




