package Variables;

public class projection {
    public static void main(String[] args){
        int a = 4, b = 3;
        double c = 12, d = 15.5;
        System.out.println((double)a / b);
        System.out.println(a / (double)b);

        double result1 = a / c;
        System.out.println(result1);
        // int restult2 = a * d; dosen't work
        int result2 = a * (int)d;
        System.out.println(result2);
        double result3 = a / d;
        double result4 = a * b;
        System.out.println(result3);
        System.out.println(1.0 / 5);


    }
}
