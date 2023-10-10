package classwork.chapter6;

public class Box {
    double width;
    double height;
    double depth;

    //BoxDemo3
    // void volume() {
    // System.out.print("Volume is equal ");
    //System.out.println(width*height*depth);
    // }


    //расчитат и  возратить объем BoxDemo4
  //  double volume() {
//        return width * height * depth;
//    }

    //Устатовить размеры параллепипеда BoxDemo5
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

   //BoxDemo6
    Box() {
        System.out.println("Costructing a Box object");
        width = 10;
        height = 10;
        depth = 10;
    }
        double volume () {
            return width * height * depth;
        }
    //BoxDemo7 consrtuctor
    Box (double w,double h, double d){
        width=w;
        height=h;
        depth=d;
    }

}
