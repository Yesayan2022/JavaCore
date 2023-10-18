package classwork.chapter7.args;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Contains: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("one parameter of variable length: ", 10);
        vaTest("three parameters of variable length: ", 1, 2, 3);
        vaTest("witout parameter of variable length: ");
    }
}
