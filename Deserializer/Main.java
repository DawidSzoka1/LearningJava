package Deserializer;

import java.io.*;
import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        User user = null;
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\Dawid\\IdeaProjects\\SerializationJava\\UserInfo.ser");
            ObjectInputStream in = new ObjectInputStream(fis);
            user = (User) in.readObject();
            in.close();
            fis.close();
            user.sayHello();
        } catch (IOException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e.getMessage());
        }


    }
}
