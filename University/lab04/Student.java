package University.lab04;


import University.lab03.Uczen;


public class Student extends Uczen {
    private int semester;
    public Student() {
        super();
    }
    public Student(String first_name, String last_name, String pesel,int semester) {
        super(first_name, last_name, pesel);
        this.semester = semester;
    }
}
