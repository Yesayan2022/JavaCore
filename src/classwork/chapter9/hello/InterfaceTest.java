package classwork.chapter9.hello;

public class InterfaceTest {
    public static void main(String[] args) {
        ArmPerson armPerson = new ArmPerson();
        EngPerson englandPerson = new EngPerson();
        RussianPerson russianPerson = new RussianPerson();

        printHelloAndGoodby(russianPerson);
        printHelloAndGoodby(armPerson);
        printHelloAndGoodby(englandPerson);

    }

    private static void printHelloAndGoodby(SayHello sayHello) {
        System.out.println(sayHello.sayHello());
        if (sayHello instanceof SayGoodby) {
            SayGoodby sayGoodby = (SayGoodby) sayHello;
            System.out.println(sayGoodby.sayGoodby());
        }
    }
}