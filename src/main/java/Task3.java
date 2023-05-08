/**Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов
двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя.*/

import java.util.Arrays;

public class Task3 {
    public static int[] sub(int[] array_1, int[] array_2) {
        if (array_1.length != array_2.length) {
            throw new RuntimeException("ОШИБКА: длины массивов не равны");
        }
        int[] arr3 = new int[array_1.length];
        for (int i = 0; i < array_1.length; i++) {
            arr3[i] = array_1[i] - array_2[i];
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] array_1 = new int[]{5, 2, 1, 5, 1};
        int[] array_2 = new int[]{6, 2, 133, 4};
        System.out.println(Arrays.toString(sub(array_1, array_2)));
    }
}
