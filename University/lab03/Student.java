package University.lab03;

import java.util.Arrays;

public class Student {
    private String first_name;
    private String last_name;
    private String pesel_number;
    public enum Gender{
        FEMALE,MALE
    }
    public enum months{
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    }
    Student(){}
    Student(String first_name, String last_name, String pesel_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.pesel_number = pesel_number;
    }

    public void printGender(){
        Gender g = ((Integer.parseInt(String.valueOf(pesel_number.charAt(9)))) % 2 == 0) ? Gender.FEMALE : Gender.MALE;
        System.out.println(g);
    }

    public void printBirthday(){
        int t = (Integer.parseInt(String.valueOf(pesel_number.charAt(3)))) - 1;
        months m = months.values()[t];
        System.out.println(m);
        System.out.println(Arrays.toString(months.values()));
        String day = pesel_number.charAt(4)+"" + pesel_number.charAt(5);
        System.out.println(day);
    }


}
