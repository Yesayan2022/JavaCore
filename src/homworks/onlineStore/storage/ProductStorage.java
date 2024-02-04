package homworks.onlineStore.storage;

import homworks.onlineStore.model.Product;

public class ProductStorage {

    private Product[] products = new Product[10];
    private int size;

    public void add(Product product) {
        if (products.length == size) {
            extend();
        }
        products[size++] = product;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }

    private void extend() {
        Product[] tmp = new Product[products.length + 10];
        System.arraycopy(products, 0, tmp, 0, products.length);
        products = tmp;

    }
}
