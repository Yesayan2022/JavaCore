package classwork.chapter8;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("superOb object contents: ");
        superOb.showij();
        System.out.println();
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("subOb object contents: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Sum of i, j, k in subOb object: ");
        subOb.sum();

    }

}
