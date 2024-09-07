package SerializationLearning;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    transient String password;//dont go to serializer
    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
