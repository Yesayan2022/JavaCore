package classwork.chapter9.p2;

public class OtherPackage {
    OtherPackage () {
        classwork.chapter9.p1.Protection p  = new classwork.chapter9.p1.Protection();
        System.out.println("Constructor from another package");
        System.out.println("n_pub = " + p.n_pub);
    }
}
