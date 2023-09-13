package classwork.chapter3;

public class ArrayAvaregeBookExample {
    public static void main(String[] args) {
        double [] numbers = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        for (int j = 0; j < numbers.length; j++)
            result = result + numbers.length;
            System.out.println("Result = " + result);
            System.out.println("Avarage meaning is " + result / numbers.length);
    }
}
