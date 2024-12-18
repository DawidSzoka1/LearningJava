package University.lab09.iterators;

import java.util.Iterator;

public class Order implements Iterable<Product> {
    Product[] products;
    public Order(Product[] products) {
        this.products = products;
    }
    public Order(){
        products = new Product[11];
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public Iterator<Product> iterator() {
        return new ConditionIterator(products);
    }
}
