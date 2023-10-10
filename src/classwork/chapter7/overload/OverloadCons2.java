package classwork.chapter7.overload;

import classwork.chapter7.overload.Box;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3);
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);

        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is equal " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is equal " + vol);
        vol = mycube.volume();
        System.out.println("Volume of cube is equal " + vol);
        vol = myclone.volume();
        System.out.println("Volume of clone is equal " + vol);

    }
}
