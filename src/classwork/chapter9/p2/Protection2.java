package classwork.chapter9.p2;

public class Protection2 extends classwork.chapter9.p1.Protection {
    Protection2() {
        System.out.println("Constructor inherited from another package");
//        System.out.println("n = " + n);  anavailable
//        System.out.println("n_pri = " + n_pri); anavailable
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
