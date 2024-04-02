package homework.dynamicarray;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    int getByIndex(int index) {
        if (index<0|| index>size){
            System.out.println("Wrong index");
            return 0;
        }
        return array[index];
    }

    void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }

}
