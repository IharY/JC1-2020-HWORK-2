package by.htp.les03.main;

/*
Дана последовательность действительных чисел а1, а2, а3 ,..., аn. Выяснить, будет ли она возрастающей.
 */

public class Task03 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int pointer = 0;

		// печатаем массив
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] > array[i]) {
				pointer++;
			}
		}
		if (pointer != 0) {
			System.out.println();
			System.out.println("Данная последовательность не является возрастающей");
		} else {
			System.out.println();
			System.out.println("Данная последовательность является возрастающей");
		}
	}
}
