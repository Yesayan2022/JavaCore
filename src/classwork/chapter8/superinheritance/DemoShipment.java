package classwork.chapter8.superinheritance;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);
        double vol;
        vol = shipment1.volume();
        System.out.println("The volume of shipment1 is "+ vol);
        System.out.println("The weight of shipment1 is "+shipment1.weight);
        System.out.println("The cost of delivery is " +shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("The volume of shipment1 is "+ vol);
        System.out.println("The weight of shipment1 is "+shipment2.weight);
        System.out.println("The cost of delivery is " +shipment2.cost);
        System.out.println();
    }
}
