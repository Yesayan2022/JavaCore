package classwork.chapter8.dynamic;

public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("The area of the figure is not determined.");
        return 0;
    }

}
