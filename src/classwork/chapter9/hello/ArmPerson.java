package classwork.chapter9.hello;

public class ArmPerson implements SayHello, SayGoodby {
    @Override
    public String sayGoodby() {
        return "Ctesutyun";
    }

    @Override
    public String sayHello() {
        return "Barev";
    }
}
