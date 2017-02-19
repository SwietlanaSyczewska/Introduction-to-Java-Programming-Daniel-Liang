package Exercise_23_03;

import java.util.Comparator;

import Exercise_23_03.Circle;
import Exercise_23_03.GeometricObject;
import Exercise_23_03.GeometricObjectComparator;
import Exercise_23_03.Rectangle;

/*********************************************************************************
* (Generic quick sort) Write the following two generic methods using quick sort. *
* The first method sorts the elements using the Comparable interface and the     *
* second uses the Comparator interface.                                          *
*                                                                                *
* public static <E extends Comparable<E>>                                        *
*   void quickSort(E[] list)                                                     *
* public static <E> void quickSort(E[] list,                                     *
*   Comparator<? super E> comparator)                                            *
*********************************************************************************/

public class Exercise_23_03 {

	public static void main(String[] args) {
		Integer[] intArray = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
		Double[] doubleArray = { 2.4, -3.24, 2.36, 535.7, 62.9, 1.36, -2.111, 0.3, 14.2, 5.12 };
		Character[] charArray = { 's', 't', 'e', 'E', 'Q', 'a', 'R', 'W', 'h', 'G' };
		String[] stringArray = { "Ann", "Peter", "Catherine", "Anton", "Wor" };
		quickSort(intArray);
		quickSort(doubleArray);
		quickSort(charArray);
		quickSort(stringArray);
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
		printArray(stringArray);
		GeometricObject[] geometricObjectArray = { new Rectangle(5.3, 2.7), new Circle(9.3), new Rectangle(2.85, 4.3),
				new Circle(52.5), new Rectangle(3.73, 8.2), new Circle(9.2) };
		quickSort(geometricObjectArray, new GeometricObjectComparator());
		printArray(geometricObjectArray);
	}

	private static <E> void quickSort(E[] array, Comparator<? super E> comparator) {
		quickSort(array, 0, array.length - 1, comparator);
	}

	private static <E> void quickSort(E[] array, int first, int last, Comparator<? super E> comparator) {
		if (last > first) {
			int pivotIndex = partition(array, first, last, comparator);
			quickSort(array, first, pivotIndex - 1, comparator);
			quickSort(array, pivotIndex + 1, last, comparator);
		}
	}

	private static <E> int partition(E[] array, int first, int last, Comparator<? super E> comparator) {
		E pivot = array[first];
		int low = first + 1;
		int high = last;
		while (high > low) {
			while (low <= high && comparator.compare(array[low], pivot) <= 0)
				low++;
			while (low <= high && comparator.compare(array[high], pivot) > 0)
				high--;
			if (high > low) {
				E temp = array[high];
				array[high] = array[low];
				array[low] = temp;
			}
		}
		while (high > first && comparator.compare(array[high], pivot) >= 0)
			high--;
		if (comparator.compare(pivot, array[high]) > 0) {
			array[first] = array[high];
			array[high] = pivot;
			return high;
		} else {
			return first;
		}
	}

	public static <E extends Comparable<E>> void quickSort(E[] array) {
		quickSort(array, 0, array.length - 1);
	}

	public static <E extends Comparable<E>> void quickSort(E[] array, int first, int last) {
		if (last > first) {
			int pivotIndex = partition(array, first, last);
			quickSort(array, first, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, last);
		}
	}

	private static <E extends Comparable<E>> int partition(E[] array, int first, int last) {
		E pivot = array[first];
		int low = first + 1;
		int high = last;
		while (high > low) {
			while (low <= high && array[low].compareTo(pivot) <= 0)
				low++;
			while (low <= high && array[high].compareTo(pivot) > 0)
				high--;
			if (high > low) {
				E temp = array[high];
				array[high] = array[low];
				array[low] = temp;
			}
		}
		while (high > first && array[high].compareTo(pivot) >= 0)
			high--;
		if (pivot.compareTo(array[high]) > 0) {
			array[first] = array[high];
			array[high] = pivot;
			return high;
		} else {
			return first;
		}
	}

	public static <E> void printArray(E[] array) {
		System.out.println("After quick sort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
