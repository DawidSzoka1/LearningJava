package University.lab06;

public class Employee implements Comparable<Employee>{
    private String name;
    private String surname;
    private double salary;

    public Employee(){}
    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(University.lab06.Employee o) {
        if(Double.compare(this.salary, o.getSalary()) > 0){
            return 1;
        }else if(Double.compare(this.salary, o.getSalary()) < 0){
            return -1;
        }
        return 0;
    }
}
