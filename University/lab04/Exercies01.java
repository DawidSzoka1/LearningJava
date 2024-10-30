package University.lab04;

public class Exercies01 {
    public static void main(String[] args) {
        Object[] o = {1, 2, 4, 7, "ala", 10, "kot", "ma", "ona", 2};
        int sum = 0;
        String s = "";
        for(Object o1 : o){
            if(o1 instanceof String){
                s += (String)o1;
            }
            else if(o1 instanceof Integer){
                sum += (Integer)o1;
            }
        }
        System.out.println(sum);
        System.out.println(s);
    }
}
