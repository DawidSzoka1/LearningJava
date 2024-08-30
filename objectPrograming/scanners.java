package objectPrograming;
import java.util.Scanner;

public class scanners {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements you wish to enter: ");
        int n = input.nextInt();
        System.out.println("you entered: " + n);
        String name = input.nextLine();
        System.out.println("you entered: " + name);
        float f = input.nextFloat();
        System.out.println("you entered: " + f);

    }
}
