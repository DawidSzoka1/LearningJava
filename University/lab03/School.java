package University.lab03;

public class School {
    private Uczen[] uczens;
    private int amount = 0;
    public School() {
        uczens = new Uczen[100];
    }
    public void getStudents(String a) {
        boolean flag = false;
        for(int i = 0; i < amount; i++) {
            if(Character.toLowerCase(uczens[i].getLast_name().charAt(0)) == a.toLowerCase().charAt(0)) {
                System.out.println(uczens[i]);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("There isn't any student with last name " +
                    "starting with " + a);
        }
    }
    public void addStudent(Uczen s) {
        for(int i = 0; i < amount; i++) {
            if(uczens[i].getPesel_number() == s.getPesel_number()) {
                System.out.println("Student with that pesel already exists");
                return;
            }
        }
        uczens[amount] = s;
        System.out.println("Student added to the list");
        amount++;
    }
    public void deleteStudent(Uczen s) {
        for(int i = 0; i < amount; i++) {
            if(uczens[i].equals(s)) {
                uczens[i] = uczens[amount - 1];
                uczens[amount - 1] = null;
                amount--;
                break;
            }
        }
        System.out.println("Student deleted from the list");
    }
    public Uczen oldest(){
        int max = 0;
        Uczen s = null;
        for(int i = 0; i < amount; i++) {
            if(uczens[i].howOld() > max){
                max = uczens[i].howOld();
                s = uczens[i];
            }
        }
        return s;
    }
    public float averageOld() {
        float sum = 0;
        for(int i = 0; i < amount; i++) {
            sum += uczens[i].howOld();
        }
        return sum / amount;
    }
    public void getByMonth(int month){
        for(int i = 0; i < amount; i++) {
            if(Integer.parseInt(String.valueOf(uczens[i].printBirthday().getMonth())) == month) {
                System.out.println(uczens[i]);
            }
        }
    }

    @Override
    public String toString() {
        String w = "";
        for(int i = 0; i < amount; i++) {
            w += uczens[i].toString() + "\n";
        }
        return w;
    }
}


class test{
    public static void main(String[] args) {
        School s = new School();
        Uczen uczen = new Uczen("d", "s", "3");
        s.addStudent(uczen);
        s.addStudent(new Uczen("a", "sd", "432"));
        System.out.println(s);
    }
}