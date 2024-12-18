package University.lab09.iterators;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Order o = new Order();
        for(int i = 0; i < 10; i++){
            o.getProducts()[i] = new Product("produkt" + i, i * 4);
        }
        o.getProducts()[10] = new Product("produkt10", 2);
        Iterator<Product> it = o.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
