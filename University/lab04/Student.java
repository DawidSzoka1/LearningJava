package University.lab04;


import University.lab03.Uczen;

import java.util.Objects;


public class Student extends Uczen {
    private int semester;
    public Student() {
        super();
    }
    public Student(String first_name, String last_name, String pesel,int semester) {
        super(first_name, last_name, pesel);
        this.semester = semester;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return student.getPesel_number().equals(this.getPesel_number());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), semester);
    }
}
