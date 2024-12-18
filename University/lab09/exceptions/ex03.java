package University.lab09.exceptions;

public class ex03 {
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a/b);
        }catch(IndexOutOfBoundsException|
                ArithmeticException e){
            System.out.println(e);
        }
    }
}
