package University.lab04;

import University.lab03.Uczen;

import java.util.HashMap;
import java.util.Map;

public class Exercise02 {
    public static void info(Uczen[] u){
        int countStundet = 0;
        int countWorker = 0;
        for(Uczen i: u){
            if(i instanceof Worker){
                countWorker++;
            }else if(i instanceof Student){
                countStundet++;
            }
        }
        System.out.println("Pracownikow jest: " + countWorker);
        System.out.println("Studntow jest: " + countStundet);
    }

    public static double mean(Uczen[] u){
        double sum = 0;
        int count = 0;
        for(Uczen i: u){
            if(i instanceof Worker){
                sum += ((Worker)i).getPensja();
                count++;
            }
        }
        return sum / count;
    }

    public static void biggestSemester(Uczen[] u){
        HashMap<Integer, Integer> semester = new HashMap<>();
        int max = 0;
        for(Uczen i: u){
            if(i instanceof Student){
                Student s = (Student)i;
                if(semester.containsKey(s.getSemester())){
                    semester.replace(s.getSemester(), semester.get(s.getSemester()) + 1);
                }else{
                    semester.put(s.getSemester(), 1);
                }
                if(semester.get(s.getSemester()) > max){
                    max = semester.get(s.getSemester());
                }
            }
        }

        for(Map.Entry<Integer, Integer> sem: semester.entrySet()){
            if(sem.getValue() == max){
                System.out.println("Semestr " + sem.getKey() + " ilosc studentow " + sem.getValue());
            }
        }

    }
    public static void main(String[] args) {
        Uczen[] list = new Uczen[5];
        Student s = new Student("a", "2", "3", 1);
        Student s2 = new Student("a", "2", "3", 1);
        Student s3 = new Student("a", "2", "3", 2);
        Student s4 = new Student("a", "2", "3", 2);
        Student s5 = new Student("a", "2", "3", 3);
        list[0] = s;
        list[1] = s2;
        list[2] = s3;
        list[3] = s4;
        list[4] = s5;
        biggestSemester(list);
    }
}
