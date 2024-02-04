package homworks.onlineStore.storage;

import homworks.onlineStore.model.Order;

public class OrderStorage {

    private Order[] orders = new Order[10];
    private int size;

    public void add(Order order) {
        if (orders.length == size) {
            extend();
        }
        orders[size++] = order;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(orders[i]);
        }
    }

    private void extend() {
        Order[] tmp = new Order[orders.length + 10];
        System.arraycopy(orders, 0, tmp, 0, orders.length);
        orders = tmp;

    }
}
