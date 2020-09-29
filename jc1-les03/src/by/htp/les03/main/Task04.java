package by.htp.les03.main;

/*
Дана последовательность натуральных чисел а1, а2, а3 ,..., аn. Создать массив из четных чисел этой последовательности.
Если таких чисел нет, то вывести сообщение об этом факте.
 */

import java.util.Random;

public class Task04 {
	public static void main(String[] args) {
		Random rn = new Random();
		int[] array = new int[10];
		int counter = 0;

		// заполняем массив случайными элементами
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(1000);
		}

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
			if (array[i] % 2 == 0) {
				counter++;
			}
		}

		if (counter != 0) {
			int[] mas = new int[counter];
			int shift = 0;

			for (int i = 0; i < array.length; i++) {
				if (array[i] % 2 == 0) {
					mas[shift] = array[i];
					shift++;
				}
			}

			System.out.println();
			System.out.println("Полученный массив:");

			for (int i = 0; i < mas.length; i++) {
				System.out.print(mas[i] + " ");
			}

		} else {
			System.out.println();
			System.out.println("Нет четных чисел");
		}

	}
}
