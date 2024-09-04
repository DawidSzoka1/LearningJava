package objectPrograming;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("objectPrograming/input.txt");
        }catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        if (fis != null){
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            fis.close();
            sc.close();
        }
    }
}
