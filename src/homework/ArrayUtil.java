package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.print("Array length: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("First element is " + numbers[0]);
        System.out.println("Last element is " + numbers[numbers.length - 1]);
        System.out.print("The min element: ");
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                  min = numbers[i];
            }
        }
        System.out.println(min);

        if (numbers.length > 2) {
            if (numbers.length % 2 == 0) {
                System.out.println("The middle number is" +
                        numbers[numbers.length / 2 - 1] + " " + numbers[numbers.length / 2]);
            } else {
                System.out.println("Middle number: "+
                        numbers[numbers.length/2]);
           }
        }

        System.out.print("Even numbers: ");
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Odd numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.print(numbers[i] + " ");
            }
        }
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 != 0) {
                oddCount++;
            }
        }
        System.out.println('\n'+"Odd count:" +oddCount);

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: "+ sum);
        System.out.println("Avarage: "+ sum/numbers.length);

    }
}
