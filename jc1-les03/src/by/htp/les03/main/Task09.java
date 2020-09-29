package by.htp.les03.main;

/*
Дан массив действительных чисел, размерность которого N. Подсчитать сколько в нем отрицательных, положительных и
нулевых элементов.
 */

import java.util.Random;

public class Task09 {
	public static void main(String[] args) {
		Random rn = new Random();
		int N = 10;
		int[] array = new int[N];
		int[] counter = new int[3];

		// заполняем массив случайными элементами
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(20) - 10;
		}

		// заполняем массив для подсчета элементов
		for (int i = 0; i < counter.length; i++) {
			counter[i] = 0;
		}

		// печатаем массив
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// выполняем задание
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				counter[0]++;
			}
			if (array[i] < 0) {
				counter[1]++;
			}
			if (array[i] == 0) {
				counter[2]++;
			}
		}

		System.out.println();
		System.out.print("Количество положительных, отрицательных и нулевых элементов соответственно: ");
		for (int i = 0; i < counter.length; i++) {
			System.out.print(counter[i] + " ");
		}

	}

}
