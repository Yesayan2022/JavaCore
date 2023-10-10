package homworks.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        for (int i = 0; i < 5000; i++) {
            dy.add(i+1);
        }
        dy.add(11);
        dy.add(22);
        dy.add(33);
       dy.print();

        dy.add(5);
        dy.add(6);
        dy.add(7);
        int a = dy.getByIndex(5);
        System.out.print(a);
    }
}
