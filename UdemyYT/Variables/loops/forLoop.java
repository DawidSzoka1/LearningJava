package UdemyYT.Variables.loops;

public class forLoop {
    public static void main(String[] args) {
        int[][] tab = {{0, 3}, {1, 4}};
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        for(int[] myTab : tab){
            System.out.println(myTab[0] + " " + myTab[1]);
        }



    }
}
