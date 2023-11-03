package classwork.chapter8.dynamic;

public class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("In the rectangle area");
        return dim1 * dim2;
    }
}
