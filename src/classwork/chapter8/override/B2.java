package classwork.chapter8.override;

public class B2 extends A2 {
    int k;

    B2(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}
