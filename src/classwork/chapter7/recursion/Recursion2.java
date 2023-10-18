package classwork.chapter7.recursion;

public class Recursion2 {
    public static void main(String[] args) {
        RecTest ob =  new RecTest (10);
        int j;
        for (j = 0; j < 10; j++) ob.values [j] =j;
        ob.printArray(10);
    }
}
