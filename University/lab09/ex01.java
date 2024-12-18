package University.lab09;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) throws CustomException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some number:");
        int y = 1;
        while(y < 100){
            try{
                y *= Integer.parseInt(sc.nextLine());;
            }catch (NumberFormatException e){
                System.out.println(e);
            }
        }
    }
}
