package homework;

public class Homework1 {
    public static void main(String[] args) {
        //my own solution of the task
       for (int i = 0; i < 6; i++) {
            System.out.println("******");

        }
        System.out.println("chisht tarberak");
        // the best version of solution
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
