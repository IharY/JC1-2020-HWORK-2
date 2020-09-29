package by.htp.les03.main;

/*
В массив A[N] Занесены натуральные числа. Найти сумму тех элементов, которые кратны данному.
 */

import java.util.Random;

public class Task01 {
	public static void main(String[] args) {
		Random rn = new Random();
		int[] array = new int[10];
		int divider = 2;
		int sum = 0;

		// заполняем массив случайными элементами
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(1000);
		}

		// печатаем массив
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// ищем сумму кратных элементов
		for (int i = 0; i < array.length; i++) {
			if (array[i] % divider == 0) {
				sum = sum + array[i];
			}
		}
		System.out.println();
		System.out.println("Сумма элементов кратных " + divider + " равна " + sum);

	}
}
