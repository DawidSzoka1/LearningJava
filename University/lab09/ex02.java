package University.lab09;

import java.util.Scanner;

public class ex02 {
    public static void method(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some numbers");
        int x = 1;
        while (x < 100){
            try{
                x *= Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e){
                System.out.println("Enter an integer: ");
                x = 0;
            }
        }
    }
    public static void main(String[] args) {
        method();
    }
}
