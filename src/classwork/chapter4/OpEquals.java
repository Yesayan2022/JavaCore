package classwork.chapter4;

public class OpEquals {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        //a=a+5
        a+=5;
        //b=b*2
        b*=4;
        //c=c+a*b
        c+=a*b;
        c%=6;
        // delenie po modulyu c= c+a*b=3+6*8=51/6 = v 51 pomeshaetsya 6*8=48,v itoge c%=51-48=3ostatok
        //esli c=8 c= 8+6*8=56  56-54=2 -eto i est ostatok
        //esli c=7  otvet=1,a esli c=6 otvet=0
        //eto podstchitivaetsya avtomaticheskii

        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);
    }
}
