package University.lab01;

import java.util.Scanner;

public class Exercise01{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some number: ");
        int number = input.nextInt();
        input.next();
        System.out.println("Enter some text: ");
        String text = input.nextLine();

        System.out.println("Your text is " + text);
        System.out.println("Your number is " + number);

        System.out.println("Enter numbers to add to break type 'x'");
        int sum = 0;
        while(input.hasNextInt()){
            sum += input.nextInt();
        }
        System.out.println(sum);


    }
}
