import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value x: ");

        double x = input.nextDouble();
        System.out.println("Enter value y: ");
        double y = input.nextDouble();
        double z = Math.sqrt(x*x + y*y);


        System.out.println(z);
        System.out.println(Math.pow(x, y));
        input.close();
    }
}
