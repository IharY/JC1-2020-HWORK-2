package by.htp.les03.main;

/*
Дана числовая последовательность а1, а2 ... аn. Указать наименьшую длину числовой оси, содержащую все эти числа.
 */

//import java.util.Random;

public class Task05 {
	public static void main(String[] args) {
		// Random rn = new Random();
		int[] array = { 10, 11, 2, 7, 9, 18, 14, 8, 12, 1 };

		int max = array[0];
		int min = array[0];

		/*
		 * //заполняем массив случайными элементами for (int i = 0; i < array.length;
		 * i++) { array[i] = rn.nextInt(1000) - 500; }
		 */

		// печатаем массив
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}

		System.out.println();
		System.out.println("Наименьшая длина числовой оси " + (max - min));
	}
}
