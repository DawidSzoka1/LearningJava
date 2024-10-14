package University.lab03;

import java.util.Arrays;

public class Student {
    private String first_name;
    private String last_name;
    private String pesel_number;

    public enum Gender {
        FEMALE, MALE
    }

    public enum months {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    }

    public Student() {
    }

    public Student(String first_name, String last_name, String pesel_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.pesel_number = pesel_number;
    }

    public void printGender() {
        Gender g = ((Integer.parseInt(String.valueOf(pesel_number.charAt(9)))) % 2 == 0) ? Gender.FEMALE : Gender.MALE;
        System.out.println(g);
    }

    private String getYear(){
        String year;
        int check = Integer.parseInt(String.valueOf(pesel_number.charAt(2)));
        switch (check) {
            case 0:
                year = "19" + pesel_number.charAt(0) + pesel_number.charAt(1);
                break;
            case 2:
                year = "20" + pesel_number.charAt(0) + pesel_number.charAt(1);
                ;
                break;
            case 8:
                year = "18" + pesel_number.charAt(0) + pesel_number.charAt(1);
                ;
                break;
            case 4:
                year =  "21" + pesel_number.charAt(0) + pesel_number.charAt(1);
                break;
            case 6:
                year =  "22" + pesel_number.charAt(0) + pesel_number.charAt(1);
                break;
            default:
                year = pesel_number.charAt(0) + "" + pesel_number.charAt(1);
        }
        return year;
    }

    public void printBirthday() {
        int t = Integer.parseInt(String.valueOf(pesel_number.charAt(3))) - 1;
        months m = months.values()[t];
        String day = pesel_number.charAt(4) + "" + pesel_number.charAt(5);
        System.out.println(day + " " + m + " " + getYear());
    }

    public boolean isValid(){
        int sum = 0;
        for(int i = 0; i<pesel_number.length()-1; i++){
            if(i % 4 == 0){
                sum += Integer.parseInt(String.valueOf(pesel_number.charAt(i)));
            }else if (i % 4 == 1){
                sum += Integer.parseInt(String.valueOf(pesel_number.charAt(i))) * 3;
            }else if (i % 4 == 2){
                sum += Integer.parseInt(String.valueOf(pesel_number.charAt(i))) * 7;
            }else{
                sum += Integer.parseInt(String.valueOf(pesel_number.charAt(i))) * 9;
            }
        }
        int check = Integer.parseInt(String.valueOf(pesel_number.charAt(10)));
        if(sum % 10 == 0){
            return check == 0;
        }
        return 10 - (sum % 10) == check;
    }
}
