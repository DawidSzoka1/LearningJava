package University.lab09;

import java.util.Scanner;

public class ex04 {
    public static void checkValidZipCode(String zipCode) {
        if(zipCode.length() != 6){
            throw new InvalidZipCodeException("Zip code must be 6 length");
        }
        if(zipCode.charAt(2) != '-'){
            throw new InvalidZipCodeException("Zip code must have '-' as 3 letter");
        }
        try{
            int zip = Integer.parseInt(zipCode.substring(0,2) + zipCode.substring(2));
            System.out.println(zip);
        }catch (NumberFormatException e){
            throw new InvalidZipCodeException("Zip code must be numeric only");
        }
        System.out.println("Correct zip code: " + zipCode);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an zip code: ");
        String zipCode = input.nextLine();
        checkValidZipCode(zipCode);
    }
}
