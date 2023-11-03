package classwork.chapter8.abstract2;

public class AbstractAreas {
    public static void main(String[] args) {
        //   Figure f = new Figure(10,10);// we cant use this
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Area is equal " + figref.area());
        figref = t;
        System.out.println("Area is equal " + figref.area());

    }
}
