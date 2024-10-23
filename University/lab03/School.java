package University.lab03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class School {
    private Student[] students;
    private int amount = 0;
    public School() {
        students = new Student[100];
    }
    public void getStudents(String a) {
        boolean flag = false;
        for(int i = 0; i < amount; i++) {
            if(Character.toLowerCase(students[i].getLast_name().charAt(0)) == a.toLowerCase().charAt(0)) {
                System.out.println(students[i]);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("There isn't any student with last name " +
                    "starting with " + a);
        }
    }
    public void addStudent(Student s) {
        for(int i = 0; i < amount; i++) {
            if(students[i].getPesel_number() == s.getPesel_number()) {
                System.out.println("Student with that pesel already exists");
                return;
            }
        }
        students[amount] = s;
        System.out.println("Student added to the list");
        amount++;
    }
    public void deleteStudent(Student s) {
        for(int i = 0; i < amount; i++) {
            if(students[i].equals(s)) {
                students[i] = students[amount - 1];
                students[amount - 1] = null;
                amount--;
                break;
            }
        }
        System.out.println("Student deleted from the list");
    }
    public Student oldest(){
        int max = 0;
        Student s = null;
        for(int i = 0; i < amount; i++) {
            if(students[i].howOld() > max){
                max = students[i].howOld();
                s = students[i];
            }
        }
        return s;
    }
    public float averageOld() {
        float sum = 0;
        for(int i = 0; i < amount; i++) {
            sum += students[i].howOld();
        }
        return sum / amount;
    }
    public void getByMonth(int month){
        for(int i = 0; i < amount; i++) {
            if(Integer.parseInt(String.valueOf(students[i].printBirthday().getMonth())) == month) {
                System.out.println(students[i]);
            }
        }
    }

    @Override
    public String toString() {
        String w = "";
        for(int i = 0; i < amount; i++) {
            w += students[i].toString() + "\n";
        }
        return w;
    }
}


class test{
    public static void main(String[] args) {
        School s = new School();
        Student student = new Student("d", "s", "3");
        s.addStudent(student);
        s.addStudent(new Student("a", "sd", "432"));
        System.out.println(s);
    }
}