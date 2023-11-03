package classwork.chapter8.abstract2;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("In the Triangle area.");
        return dim1 * dim2 / 2;
    }
}
