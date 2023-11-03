package classwork.chapter8.superinheritance;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeightSuper mybox1 = new BoxWeightSuper(10, 20, 15, 34.3);
        BoxWeightSuper mybox2 = new BoxWeightSuper(2, 3, 4, 0.76);
        BoxWeightSuper mybox3 = new BoxWeightSuper();
        BoxWeightSuper mycube = new BoxWeightSuper(3, 2);
        BoxWeightSuper myclone = new BoxWeightSuper(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("The mybox1 volume is " + vol);
        System.out.println("The mybox1 weight is " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("The volume of mybox2 is " + vol);
        System.out.println("The weight of mybox2 is " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("The volume of mybox3 is " + vol);
        System.out.println("The weight of mybox3 is " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("The volume of myclone is " + vol);
        System.out.println("The weight of myclone is " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("The volume of mycube is " + vol);
        System.out.println("The weight of mycube is " + mycube.weight);
        System.out.println();
    }
}
