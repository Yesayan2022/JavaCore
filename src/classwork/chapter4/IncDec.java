package classwork.chapter4;

public class IncDec {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b;
        //esli inkrement stoit do ++b,v etom sluchai peremennaya uvelichitsya na 1
        //a esli posle a++, v etom sluchay prisvaivaetsya znachenie peremennoy,
        //a  sama peremennaya 'a' uvelichivaetsya na 1
        d = a++;
        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
