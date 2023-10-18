package classwork.chapter7.args;

public class VarArgs {
    static void vaTest(int... v) {
        System.out.print("Number of arguments: "
                + v.length + " Contains: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
