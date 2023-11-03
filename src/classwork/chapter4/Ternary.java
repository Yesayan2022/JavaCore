package classwork.chapter4;

public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.print(" Absolut value is ");
        System.out.println(i + " equal " + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.print(" Absolut value is ");
        System.out.println(i + " equal " + k);
    }
}
