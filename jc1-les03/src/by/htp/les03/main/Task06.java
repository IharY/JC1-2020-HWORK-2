package by.htp.les03.main;

/*
Дана последовательность действительных чисел а1, а2 ... аn. Заменить все ее члены больше данного Z, этим числом.
Подсчитать количество замен
 */

import java.util.Random;

public class Task06 {
	public static void main(String[] args) {
		Random rn = new Random();
		int[] array = new int[10];
		int counter = 0;
		int Z = 228;

		// заполняем массив случайными элементами
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(1000 - 500);
		}

		// печатаем массив
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// Заменяем элементы
		for (int i = 0; i < array.length; i++) {
			if (array[i] > Z) {
				array[i] = Z;
				counter++;
			}
		}

		System.out.println();

		// печатаем новый массив
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		System.out.println("Количество произведенных замен " + counter);

	}
}
