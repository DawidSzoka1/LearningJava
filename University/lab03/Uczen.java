package University.lab03;


import java.time.LocalDate;
import java.util.Objects;

public class Uczen {
    private String first_name;
    private String last_name;
    private String pesel_number;

    public enum Gender {
        FEMALE, MALE
    }


    public Uczen() {
    }

    public Uczen(String first_name, String last_name, String pesel_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.pesel_number = pesel_number;
    }

    public void printGender() {
        Gender g = ((Integer.parseInt(String.valueOf(pesel_number.charAt(9)))) % 2 == 0) ? Gender.FEMALE : Gender.MALE;
        System.out.println(g);
    }


    public LocalDate printBirthday() {
        enum months {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
            JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
        }
        int year = Integer.parseInt(pesel_number.substring(0, 2));
        int month = Integer.parseInt(pesel_number.substring(2, 4));
        int day = Integer.parseInt(pesel_number.substring(4, 6));


        if (month >= 1 && month <= 12) {
            year += 1900;
        } else if (month >= 21 && month <= 32) {

            month -= 20;
            year += 2000;
        } else if (month >= 81 && month <= 92) {

            month -= 80;
            year += 1800;
        } else if (month >= 41 && month <= 52) {

            month -= 40;
            year += 2100;
        } else if (month >= 61 && month <= 72) {

            month -= 60;
            year += 2200;
        } else {
            throw new IllegalArgumentException("Nieprawidłowy miesiąc w numerze PESEL");
        }

        return LocalDate.of(year, month, day);
    }
    public int howOld(){
        return LocalDate.now().getYear() - printBirthday().getYear();
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

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPesel_number() {
        return pesel_number;
    }

    public void setPesel_number(String pesel_number) {
        this.pesel_number = pesel_number;


    }

    @Override
    public String toString() {
        return "Student{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", pesel_number='" + pesel_number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczen uczen = (Uczen) o;
        return Objects.equals(first_name, uczen.first_name) && Objects.equals(last_name, uczen.last_name) && Objects.equals(pesel_number, uczen.pesel_number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first_name, last_name, pesel_number);
    }

    public boolean spr(Uczen s){
        return this.printBirthday().getMonth() == s.printBirthday().getMonth();
    }
}
