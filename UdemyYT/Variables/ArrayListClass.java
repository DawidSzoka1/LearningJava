package UdemyYT.Variables;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>();//only wrapper class in <>
        foods.add("Apple");
        foods.add("Banana");
        foods.set(0, "Replace");
        foods.remove(1);
//        foods.clear(); removes all
        for(int i = 0; i<foods.size(); i++){
            System.out.println(foods.get(i));
        }
        for(String food: foods){
            System.out.println(food);
        }

        ArrayList<ArrayList<String>> list = new ArrayList<>();
        ArrayList<String> foods1 = new ArrayList<>();
        foods1.add("Apple");
        foods1.add("Banana");
        list.add(foods1);
        ArrayList<String> foods2 = new ArrayList<>();
        foods2.add("pizza");
        foods2.add("nutella");
        foods2.add("pinutela");
        list.add(foods2);
        System.out.println(list);
        for(ArrayList<String> foods3: list){
            for(String food: foods3){
                System.out.print(food + " ");
            }
        }
    }
}
