package UdemyYT.Variables.Files;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class OperationsOnFiles {
    public static void main(String[] args){
        File file = new File("Files" + File.separator + "text.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            }catch (IOException e){
                System.out.println("IOException " + e.getMessage());
            }
        }
        try{
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getCanonicalPath());
        }catch (IOException e){
            System.out.println("IOException " + e.getMessage());
        }
        System.out.println(file);
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isFile());
        System.out.println(new Date(file.lastModified()));
        System.out.println("length in baits " + file.length());
        //file.delete();
        File directory = new File("Files");
        //directory.mkdir();
        //directory.mkdirs(); to create multiple directorys
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(file.getParent());
        writeListDir(directory);


    }
    static boolean writeListDir(File file){
        if(!file.exists()){
            System.out.println("File does not exist");
            return false;
        }
        if(!file.isDirectory()){
            System.out.println("File is not a directory");
            return false;
        }
        if(file.list() == null){
            System.out.println("File list is null");
            return false;
        }
        for(String filename: file.list()){
            File t = new File(file.getPath(), filename);
            System.out.println(t.getAbsolutePath());
            if(t.isDirectory()){
                writeListDir(t);
            }
        }

        return true;
    }
}
