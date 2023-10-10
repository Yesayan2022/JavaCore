package classwork.chapter7.testobject;

public class CallByValue {
    public static void main(String[] args) {
        Test ob= new Test (0,0);
        int a = 15, b = 20;
        System.out.println("a & b before the call: "+ a+" "+b);
       // ob.meth(ob);
        System.out.println("a & b after the call: " + a + " " + b);

    }
}
