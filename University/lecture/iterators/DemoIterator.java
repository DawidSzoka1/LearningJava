package University.lecture.iterators;

import java.util.*;

public class DemoIterator {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(1);
        set.add(20);
//        TreeSet<Data> daty = new TreeSet<>();
//        daty.add(new Data(16, 12, 2024));
//        daty.add(new Data(16, 12, 2022));
//        daty.add(new Data(16, 11, 2024));
//        System.out.println(daty);

        TreeSet<Data> daty = new TreeSet<>(
                (o1, o2) -> Comparator
                        .comparing(Data::getR)
                        .thenComparing(Data::getM)
                        .thenComparing(Data::getD)
                        .compare(o1, o2)
        );
        daty.add(new Data(16, 12, 2024));
        daty.add(new Data(16, 12, 2022));
        daty.add(new Data(16, 11, 2024));
        System.out.println(daty);

        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person("asd", new Data(2, 3, 2024)));
        persons.add(new Person("asadd", new Data(2, 3, 2024)));
        persons.add(new Person("asd", new Data(3, 3, 2024)));
        System.out.println(persons);

        ArrayList<Person> pe = new ArrayList<>(persons);

        System.out.println(pe);
        Collections.sort(pe,
                (o1, o2) ->
                        Comparator
                                .comparing(Person::getName).reversed()
                                .thenComparing(Person::getBirthday)
                                .compare(o1, o2)
        );
        System.out.println(pe);

    }
}
