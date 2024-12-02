package University.lecture;

import java.util.*;

public class Contairner {
    static void print(List<Integer> l){
        for(int i = 0; i < l.size(); i++){
            System.out.print(l.get(i) + ((i < l.size() -1) ? "; " : ""));
        }
    }
// ? dowolny typ tam moze byc
    static void print2(Collection<?> l){
        Iterator<?> iter = l.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + (iter.hasNext() ? "; " : ""));
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(2);list.add(3);list.add(-4);list.add(5);list.add(6);list.add(7);list.add(8);

        print(list);
        System.out.println();
        Set<Integer> set = new TreeSet<>();
        set.add(1);set.add(2);set.add(3);set.add(-4);set.add(5);set.add(6);set.add(7);

        System.out.println(set);
        print2(set);
        System.out.println();
        List<String> st = new ArrayList<>();
        st.add("a");st.add("b");st.add("c");st.add("d");st.add("e");
        print2(st);

    }
}
