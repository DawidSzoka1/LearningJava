package UdemyYT.Variables.Files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Files/test.txt");
            writer.write("Hello World \nThis is my new text\n");
            writer.append("Add to end of file\n");
            writer.close();
        }catch (IOException e) {
            System.out.println("IOException " + e.getMessage());
            e.printStackTrace();
        }

    }
}
