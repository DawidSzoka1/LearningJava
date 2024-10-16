package University.lab03;


import java.util.Objects;

public class Student {
    private String first_name;
    private String last_name;
    private String pesel_number;

    public enum Gender {
        FEMALE, MALE
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
                year = "19" + pesel_number.substring(0,2);
                break;
            case 2:
                year = "20" + pesel_number.substring(0,2);
                ;
                break;
            case 8:
                year = "18" + pesel_number.substring(0,2);
                ;
                break;
            case 4:
                year =  "21" + pesel_number.substring(0,2);
                break;
            case 6:
                year =  "22" + pesel_number.substring(0,2);
                break;
            default:
                year = pesel_number.substring(0,2);
        }
        return year;
    }

    public void printBirthday() {
        enum months {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
            JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
        }
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
        Student student = (Student) o;
        return Objects.equals(first_name, student.first_name) && Objects.equals(last_name, student.last_name) && Objects.equals(pesel_number, student.pesel_number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first_name, last_name, pesel_number);
    }
}
