package University.lab06;

import University.lab02.Point;

import java.util.*;

public class ex01 {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 =new ArrayList<>();
        Integer[] tab={3,4,5,67,8,6,6,3};
        for(int i=0;i<tab.length;i++){
            lista1.add(tab[i]);
        }
        lista1.add(2,20);//dodaje na drugim indeksie 20
        lista1.add(3);
        lista1.add(4);
        lista1.add(6);
        lista1.add(1);
        lista1.set(2, 10);//modyfikuje 2 indeks
        System.out.println("lista <Integer> "+lista1);
        int sum = 0;
        for(int x : lista1){
            sum += x;
        }
        System.out.println("sum: "+ sum);
        Iterator<Integer> iter = lista1.iterator();
        while(iter.hasNext()){
            Integer next = iter.next();
            if(next % 2 == 0){
                iter.remove();
            }
        }
        lista1.sort(Integer::compare);
        System.out.println(lista1);
        lista1.sort(Collections.reverseOrder())  ;
        System.out.println(lista1);
        Set<Integer> s = new TreeSet<>(lista1);
        System.out.println(s);




    }
}
