package UdemyYT.Variables.objectPrograming;

public class HandlingErrors {
    public static void main(String[] args){
        int a = 10;
        try {
            if (a == 10) {
                throw new MyExeption("my error");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(5/1);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero " + e);
        }catch(Exception e){

        } finally{
            System.out.println("finally block");//allways do
        }

    }
}


class MyExeption extends Exception{
    public MyExeption(String msg){
        super(msg);
    }
}