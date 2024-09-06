package Files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Files" + File.separator + "test.txt");
            int data = fr.read();
            StringBuilder line = new StringBuilder();
            while (data != -1) {
                while((char)data != '\n'){
                    line.append((char) data);
                    data = fr.read();
                }
                System.out.println(line);
                line = new StringBuilder();
                data = fr.read();
            }
            fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
