package part5.Task16;

public class Task16{
    //16. Створити загальний (generic) метод, який знаходить максимальний елемент у масиві будь-якого типу. Метод повинен працювати з різними типами даних, такими як цілі числа, подвійні числа та рядки.
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {3, 7, 1, 9, 4, 5};
        Double[] doubleArray = {2.5, 1.1, 3.7, 2.2, 5.0};
        String[] stringArray = {"apple", "banana", "orange", "grape"};

        Integer maxInt = findMax(intArray);
        Double maxDouble = findMax(doubleArray);
        String maxString = findMax(stringArray);

        System.out.println("Max Integer: " + maxInt);
        System.out.println("Max Double: " + maxDouble);
        System.out.println("Max String: " + maxString);
    }
}