package University.lab09.iterators;

import java.util.Iterator;

public class CustomIterator implements Iterator<Product> {
    int cursor = 0;
    Product[] product;
    public CustomIterator(Product[] product) {
        this.product = product;
    }
    @Override
    public boolean hasNext() {
        return cursor < product.length;
    }

    @Override
    public Product next() {
        Product p = product[cursor];
        cursor += 2;
        return p;

    }
}
