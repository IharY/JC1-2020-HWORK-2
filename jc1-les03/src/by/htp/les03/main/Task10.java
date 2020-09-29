package by.htp.les03.main;

/*
Даны действительные числа а1, а2 ... а2n. Найти max(a1 + a(2n), a2 + a(2n-1) ,..., an + a(n+1)).
 */

import java.util.Random;

public class Task10 {
	public static void main(String[] args) {
		Random rn = new Random();
		int[] array = new int[10];
		int last = array.length - 1;
		int max = 0;

		// заполняем массив случайными элементами
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(1000);
		}

		System.out.print("Наш массив: ");
		// печатаем массив
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < array.length / 2; i++) {

			if (max < array[i] + array[last]) {
				max = array[i] + array[last];
			}
			last--;
		}
		System.out.println("максимальная сумма элементов выполняющих условие задания " + max);

	}
}
