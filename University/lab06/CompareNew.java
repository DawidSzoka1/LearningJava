package University.lab06;

import java.util.Comparator;

public class CompareNew implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getSurname().equals(o2.getSurname())){
            if(o1.getName().equals(o2.getName())){
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
            return o1.getName().compareTo(o2.getName());
        }
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
