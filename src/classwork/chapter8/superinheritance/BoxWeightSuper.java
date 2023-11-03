package classwork.chapter8.superinheritance;

import classwork.chapter8.boxinheritance.Box;

public class BoxWeightSuper extends Box2 {
    double weight;
    BoxWeightSuper(BoxWeightSuper ob) {
        super(ob);
        weight = ob.weight;
    }
    BoxWeightSuper(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }
    BoxWeightSuper() {
        super();
        weight = -1;
    }
    BoxWeightSuper(double len, double m) {
        super (len);
        weight= m;
    }
}
