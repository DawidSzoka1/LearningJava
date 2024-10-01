package UdemyYT.Variables.SerializationLearning;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.name = "dawid";
        user.password = "password";
        try{
            FileOutputStream fos = new FileOutputStream("SerializationLearning"+File.separator +"UserInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(user);
            out.close();
            fos.close();
            System.out.println("Object info saved");
            long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
            System.out.println(serialVersionUID);

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
