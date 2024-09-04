package objectPrograming;

public class Concluding {
    public static void main(String[] args){
        Address a = new Address(43, "test", "test");
        Person2 p = new Person2();
        p.getAddress();
        p.address = a;
        p.getAddress();
        p.address.city = "change";
        p.getAddress();
        System.out.println(a.city);


    }
}

class Person2{
    String name;
    String surname;
    Address address;
    Person2(){}
    Person2(String name, String surname, Address address){
        this.name = name;
        this.surname = surname;
        this.address = address;
    }
    Person2(String name, String surname, int number, String street, String city){
        this.name = name;
        this.surname = surname;
        address = new Address(number, street, city);
    }
    void getAddress(){
        if (address != null){
            System.out.println(address.number + " " + address.street + " " + address.city);
        }
        else{
            System.out.println("Address is null");
        }

    }

}


class Address{
    int number;
    String street;
    String city;
    Address(int number, String street, String city){
        this.number = number;
        this.street = street;
        this.city = city;
    }
    Address(){}
}
