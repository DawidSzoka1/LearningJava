package UdemyYT.Variables.loops;

public class whileDoWhile {
    public static void main(String[] args){
        int[] tab = {3, 4, 5, 6, 7, 8, 9, 10};

        int i = 0;
        while(i < tab.length){
            System.out.println(tab[i]);
            i++;
        }
        i = 4;
        do{
            System.out.println(tab[i]);
            i ++;
        } while(i < 3);


    }
}
