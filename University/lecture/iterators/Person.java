package University.lecture.iterators;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private Data birthday;
    public Person(String name, Data birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Data getBirthday() {
        return birthday;
    }

    public void setBirthday(Data birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return Comparator
                .comparing(Person::getName)
                .thenComparing(Person::getBirthday)
                .compare(this, o);
    }
}
