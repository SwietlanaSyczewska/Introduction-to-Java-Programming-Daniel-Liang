package Exercise_23_01;

import java.util.Comparator;

/***************************************************************
 *(Generic bubble sort) Write the following two generic methods*
 *using bubble sort. The first method sorts the elements using *
 *the Comparable interface and the second uses the Comparator  *
 *interface.                                                   *
 ***************************************************************/

public class Exercise_23_01 {
	public static void main(String[] args) {
		Integer[] intArray = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
		Double[] doubleArray = { 2.4, -3.24, 2.36, 535.7, 62.9, 1.36, -2.111, 0.3, 14.2, 5.12 };
		Character[] charArray = { 's', 't', 'e', 'E', 'Q', 'a', 'R', 'W', 'h', 'G' };
		String[] stringArray = { "Catherine", "Anton", "Wor" };
		bubbleSort(intArray);
		bubbleSort(doubleArray);
		bubbleSort(charArray);
		bubbleSort(stringArray);
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
		printArray(stringArray);
		GeometricObject[] geometricObjectArray = { new Rectangle(5.3, 2.7), new Circle(9.3), new Rectangle(2.85, 4.3),
				new Circle(52.5), new Rectangle(3.73, 8.2), new Circle(9.2) };
		bubbleSort(geometricObjectArray, new GeometricObjectComparator());
		printArray(geometricObjectArray);
	}

	public static <E extends Comparable<E>> void bubbleSort(E[] array) {
		boolean needNextPass = true;
		for (int k = 1; k < array.length && needNextPass; k++) {
			needNextPass = false;
			for (int i = 0; i < array.length - k; i++) {
				if (array[i].compareTo(array[i + 1]) > 0) {
					E temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					needNextPass = true;
				}
			}
		}
	}

	public static <E> void bubbleSort(E[] array, Comparator<? super E> comparator) {
		boolean needNextPass = true;
		for (int k = 1; k < array.length && needNextPass; k++) {
			needNextPass = false;
			for (int i = 0; i < array.length - k; i++) {
				if (comparator.compare(array[i], array[i + 1]) > 0) {
					E temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					needNextPass = true;
				}
			}
		}
	}

	public static <E> void printArray(E[] array) {
		System.out.println("After bubble sort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
