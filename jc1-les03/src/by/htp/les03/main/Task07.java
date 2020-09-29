package by.htp.les03.main;

/*
Даны действительные числа а1, а2 ... аn. Поменять местами наибольший и наименьший элемент.
 */

//import java.util.Random;

public class Task07 {
    public static void main(String[] args) {
        //Random rn = new Random();
        int[] array = {10, 11, 2, 7, 9, 18, 14, 8, 12, 1};
        int maxpointer = 0;
        int minpointer = 0;
        int helper;

        /*//заполняем массив случайными элементами
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(1000) - 500;
        }*/

        int max = array[0];
        int min = array[0];

        //печатаем массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        //ищем индексы минимального и максимального элементов
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxpointer = i;
            }

            if (array[i] < min) {
                min = array[i];
                minpointer = i;
            }
        }

        System.out.println("самый большой элемент массива - " + max + " расположен под номером " + maxpointer + " самый маленький элемент - " + min + " находится под номером " + minpointer);

        //меняем местами элементы
        helper = array[minpointer];
        array[minpointer] = array[maxpointer];
        array[maxpointer] = helper;

        //печатаем получившейся массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
