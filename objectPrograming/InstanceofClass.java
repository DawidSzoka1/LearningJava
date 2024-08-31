package objectPrograming;

public class InstanceofClass {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Teacher();
        persons[1] = new Student();
        persons[0].display();
        persons[0].displayEmployee();
        for(Person person: persons) {
            if(person instanceof Teacher) {
                person.displayEmployee();
            }else if(person != null) {
                person.display();
            }
//            if(persons[i] instanceof Person) {
//                persons[i].display();
//            }

        }

    }
}


abstract class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    Person(){}
    abstract void display();
    void displayEmployee(){}
}

abstract class Employee extends Person {
    double earnings;
    Employee() {}
    Employee(String name, double earnings) {
        super(name);
        this.earnings = earnings;
    }


}

class Student extends Person {
    int id;
    Student() {}
    Student(String name, int id) {
        super(name);
        this.id = id;
    }
    void display() {
        System.out.println(id + " is a student");
    }
}

class Teacher extends Employee {
    String duty;
    Teacher() {}
    Teacher(String name, double earnings, String duty) {
        super(name, earnings);
        this.duty = duty;
    }
    @Override
    void display() {
        System.out.println(duty + " is a teacher" + super.name + " " + super.earnings);
    }

    @Override
    void displayEmployee() {
        System.out.println(duty + " is a teacher employee");
    }
}