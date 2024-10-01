package UdemyYT.Variables.operators;

public class logic {
    public static void main(String[] args){
        int a = 3,
            b = 5,
            c = 8;

        if(a == b && b != c || a > c){
            System.out.println("a == b i b != c lub a > c");
        } else if (a > 5) {
            System.out.println("a > 5");
        }else{
            System.out.println("nic");
        }
        ImportTesting test = new ImportTesting();
        System.out.println(test.y);
    }
}
