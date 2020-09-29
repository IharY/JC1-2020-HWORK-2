package by.htp.les03.main;

/*
Даны целые числа а1, а2 ... аn. Вывести на печать только те числа, для которых аi > i.
 */

import java.util.Random;

public class Task08 {
	public static void main(String[] args) {

		Random rn = new Random();
		int[] array = new int[10];

		// заполняем массив случайными элементами
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(10);
		}

		// печатаем массив
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
		System.out.println("Числа выполняющие условие:");

		// проверяем элементы
		for (int i = 0; i < array.length; i++) {
			if (array[i] > i) {
				System.out.print(array[i] + " ");
			}
		}

		System.out.println();
	}
}
