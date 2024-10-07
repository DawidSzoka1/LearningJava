package SerializationLearning;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    String name;
    transient String password;//dont go to serializer
    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
