package homework;

public class ForExamples {
    public static void main(String[] args) {
        System.out.println("Տպել 1-ից 1000 թվերը իրար կողք, արանքում դնելով - սինվոլը։ Այնպես գրեք, որ վերջում - չլինի։");
        int count = 1000;
        for (int i = 0; i < count; i++) {
            System.out.print(i + 1);
            if (i != count - 1) {
                System.out.print(" - ");
            }
        }
        System.out.println();
        System.out.println("Տպել 1-ից 100 թվերի մեջ ընկած զույգերը օգտագործելով % գործողությունը։");
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("գտնել մասիվի ամենամեծ թիվը ու տպել");
        int []array ={2,5,4,6,8,2,9,7};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Max = "+ max);
    }
}
