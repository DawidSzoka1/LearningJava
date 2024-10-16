package University.lab03;

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
        students[amount] = s;
        System.out.println("Student added to the list");
        amount++;
    }
    public void deleteStudent(Student s) {
        for(int i = 0; i < amount; i++) {
            if(students[i].equals(s)) {
                students[i] = null;
                amount--;
                break;
            }
        }
        System.out.println("Student deleted from the list");
    }
}


class test{
    public static void main(String[] args) {
        School s = new School();
        Student student = new Student("d", "s", "3");

        s.addStudent(student);
        s.getStudents("S");
        s.deleteStudent(student);
        s.getStudents("S");
    }
}