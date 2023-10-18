package classwork.chapter7.stringdemo;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder(" Barev ");
        for (int i = 0; i < 10; i++) {
            result.append(" ").append(i);
        }
        System.out.println(result);
    }
}
