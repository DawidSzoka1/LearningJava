package University.lab06;

import java.util.ArrayList;
import java.util.Iterator;

public class Employees {
    private ArrayList<Employee> employees;

    public Employees() {
        employees = new ArrayList<>();
    }
    public Employees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public Employee getEmployeeBySurname(String surname){
        for(Employee employee : employees){
            if(employee.getSurname().equals(surname)){
                return employee;
            }
        }
        return null;
    }

    public void deleteEmployeeBySurname(String surname){
        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if(employee.getSurname().equals(surname)){
                iterator.remove();
            }
        }
    }

    public ArrayList<Employee> getListAboveSalary(double salary){
        ArrayList<Employee> e = new ArrayList<>();
        Iterator<Employee> iter = employees.iterator();
        while(iter.hasNext()){
            Employee employee = iter.next();
            if(Double.compare(employee.getSalary(), salary) > 0){
                e.add(employee);
            }
        }
        return e;
    }
}
