package homworks.sort;

public class ArraySort {
    public void sort() {
        int[] numbers = {6, 4, 8, 2, 9, 10, 3, 7};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[j - 1] > numbers[j]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = tmp;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
