package objectPrograming;

public record TestingRecord(String name, int age) {
    // record do that all for us
    /*
     private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    */
    void newMethod() {
        System.out.println("New method");
    }
}

class Test2{
    public static void main(String[] args) {
        TestingRecord testingRecord = new TestingRecord("John", 20);
        System.out.println(testingRecord);
        testingRecord.newMethod();
    }
}