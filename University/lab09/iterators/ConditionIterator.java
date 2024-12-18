package University.lab09.iterators;

import java.util.Iterator;

public class ConditionIterator implements Iterator<Product> {
    int cursor = 0;
    Product[] products;

    public ConditionIterator(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        int tempCursor = cursor;
        Product p = products[tempCursor++];
        while (tempCursor < products.length && p.getPrice() < 5) {
            p = products[tempCursor++];
        }
        return p.getPrice() > 5;
    }

    @Override
    public Product next() {
        Product product = products[cursor++];
        while (product.getPrice() < 5) {
            product = products[cursor++];
        }
        return product;
    }
}
