package classwork.chapter8.superinheritance;

public class B extends A {
    int i;

    B ( int a, int b) {
        super.i = a;
        i = b;
    }
    void show () {
        System.out.println("i in the superclass: " + super.i);
        System.out.println("i in the subclass: "  + i);
    }
}
