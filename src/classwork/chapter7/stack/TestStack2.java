package classwork.chapter7.stack;

public class TestStack2 {
    public static void main(String[] args) {
        Stack2 mystack1 = new Stack2 (5);
        Stack2 mystack2 = new Stack2 (8);

        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);
        System.out.print("Stack in mystack1: ");
        for (int i = 0; i < 5; i++)
            System.out.print(mystack1.pop());
        System.out.println();
        System.out.print("Stack in mystack2: ");
        for (int i = 0; i < 8; i++)
            System.out.print(mystack2.pop());
    }
}
