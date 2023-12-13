package classwork.chapter9.callback;

public class Client implements Callback {

    @Override
    public void callback(int p) {
        System.out.println("Methode Callback(), "
                + "callable with value " + p);
    }
}
