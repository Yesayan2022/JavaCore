package classwork.chapter3;

public class ArrayAvaregeBookExample {
    public static void main(String[] args) {
        double nums[]={10.1,11.2,12.3,13.4,14.5};
        double result=0;
        int i;
        for (int j = 0; j < 3; j++) {
        result=result+nums[j];
            System.out.println("Avarage meaning is " + result/5);

        }
        System.out.println("fine");
    }
}
