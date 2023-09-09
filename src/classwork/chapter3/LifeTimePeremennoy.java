package classwork.chapter3;

public class LifeTimePeremennoy {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y equal: " + y);
            y = 100;
            System.out.println("now y is: " + y);

        }
    }
}
