package classwork.chapter8.abstract2;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("In the Rectangle area.");
        return dim1 * dim2;
    }
}
