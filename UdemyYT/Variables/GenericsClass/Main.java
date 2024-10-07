package UdemyYT.Variables.GenericsClass;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyIntegerClass myInteger = new MyIntegerClass(1);
        System.out.println(myInteger.getValue());
        System.out.println(myDouble.getValue());
        MyGenericClass<Integer, Double> myInt = new MyGenericClass<>(1, 32.3);
        MyGenericClass<Double, Integer> myD = new MyGenericClass<>(3.123, 4);
        System.out.println(myInt.getValue());
        System.out.println(myD.getValue());
        HashMap<Integer, String> users = new HashMap<>();
        users.put(1, "John");
        users.put(2, "Doe");
        users.put(3, "Mary");
        System.out.println(users);
        for(Integer i: users.keySet()){
            System.out.println(i);
        }
        for(String v: users.values()){
            System.out.println(v);
        }
    }
}
