package Exercise_23_02;

import java.util.Arrays;
import java.util.Comparator;

import Exercise_23_02.Circle;
import Exercise_23_02.GeometricObject;
import Exercise_23_02.GeometricObjectComparator;
import Exercise_23_02.Rectangle;

/*********************************************************************
 * (Generic merge sort) Write the following two generic methods using * merge
 * sort. The first method sorts the elements using the * Comparable interface
 * and the second uses the Comparator interface.*
 *********************************************************************/

public class Exercise_23_02 {
	public static void main(String[] args) {
		Integer[] intArray = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
		Double[] doubleArray = { 2.4, -3.24, 2.36, 535.7, 62.9, 1.36, -2.111, 0.3, 14.2, 5.12 };
		Character[] charArray = { 's', 't', 'e', 'E', 'Q', 'a', 'R', 'W', 'h', 'G' };
		String[] stringArray = { "Catherine", "Anton", "Wor" };
		mergeSort(intArray);
		mergeSort(doubleArray);
		mergeSort(charArray);
		mergeSort(stringArray);
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
		printArray(stringArray);
		GeometricObject[] geometricObjectArray = { new Rectangle(5.3, 2.7), new Circle(9.3), new Rectangle(2.85, 4.3),
				new Circle(52.5), new Rectangle(3.73, 8.2), new Circle(9.2) };
		mergeSort(geometricObjectArray, new GeometricObjectComparator());
		printArray(geometricObjectArray);
	}

	public static <E extends Comparable<E>> void mergeSort(E[] array) {
		if (array.length > 1) {
			E[] firstHalf = (E[]) new Comparable[array.length / 2];
			System.arraycopy(array, 0, firstHalf, 0, array.length / 2);
			mergeSort(firstHalf);
			int secondHalfLength = array.length - array.length / 2;
			E[] secondHalf = (E[]) new Comparable[secondHalfLength];
			System.arraycopy(array, array.length / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
			merge(firstHalf, secondHalf, array);
		}
	}

	public static <E> void mergeSort(E[] array, Comparator<? super E> comparator) {
		if (array.length > 1) {
			E[] firstHalf = Arrays.copyOf(array, array.length / 2);
			mergeSort(firstHalf, comparator);
			int secondHalfLength = array.length - array.length / 2;
			E[] secondHalf = Arrays.copyOfRange(array, array.length / 2, array.length);
			mergeSort(secondHalf, comparator);
			merge(firstHalf, secondHalf, array, comparator);
		}
	}

	public static <E extends Comparable<E>> void merge(E[] array1, E[] array2, E[] temp) {
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;
		while (current1 < array1.length && current2 < array2.length) {
			if (array1[current1].compareTo(array2[current2]) < 0)
				temp[current3++] = array1[current1++];
			else
				temp[current3++] = array2[current2++];
		}
		while (current1 < array1.length)
			temp[current3++] = array1[current1++];

		while (current2 < array2.length)
			temp[current3++] = array2[current2++];
	}

	public static <E> void merge(E[] array1, E[] array2, E[] temp, Comparator<? super E> comparator) {
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;
		while (current1 < array1.length && current2 < array2.length) {
			if (comparator.compare(array1[current1], array2[current2]) < 0)
				temp[current3++] = array1[current1++];
			else
				temp[current3++] = array2[current2++];
		}
		while (current1 < array1.length)
			temp[current3++] = array1[current1++];

		while (current2 < array2.length)
			temp[current3++] = array2[current2++];
	}

	public static <E> void printArray(E[] array) {
		System.out.println("After merge sort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}