package Exercise_23_05;

import java.util.Comparator;

import Exercise_23_05.Circle;
import Exercise_23_05.GeometricObject;
import Exercise_23_05.GeometricObjectComparator;
import Exercise_23_05.Rectangle;

/*********************************************************************************
* (Generic heap sort) Write the following two generic methods using heap sort.   *
* The first method sorts the elements using the Comparable interface and the     *
* second uses the Comparator interface.                                          *
*                                                                                *
* public static <E extends Comparable<E>>                                        *
*   void heapSort(E[] list)                                                      *
* public static <E> void heapSort(E[] list,                                      *
*   Comparator<? super E> comparator)                                            *
*********************************************************************************/

public class Exercise_23_05 {
	public static void main(String[] args) {
		Integer[] intArray = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
		Double[] doubleArray = { 2.4, -3.24, 2.36, 535.7, 62.9, 1.36, -2.111, 0.3, 14.2, 5.12 };
		Character[] charArray = { 's', 't', 'e', 'E', 'Q', 'a', 'R', 'W', 'h', 'G' };
		String[] stringArray = { "Ann", "Peter", "Catherine", "Anton", "Wor" };
		heapSort(intArray);
		heapSort(doubleArray);
		heapSort(charArray);
		heapSort(stringArray);
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
		printArray(stringArray);
		GeometricObject[] geometricObjectArray = { new Rectangle(5.3, 2.7), new Circle(9.3), new Rectangle(2.85, 4.3),
				new Circle(52.5), new Rectangle(3.73, 8.2), new Circle(9.2) };
		heapSort(geometricObjectArray, new GeometricObjectComparator());
		printArray(geometricObjectArray);
	}

	private static <E> void heapSort(E[] array, Comparator<? super E> comparator) {
		HeapWithComparator<E> heap = new HeapWithComparator<>(comparator);
		for (int i = 0; i < array.length; i++)
			heap.add(array[i]);
		for (int i = array.length - 1; i >= 0; i--)
			array[i] = heap.remove();
	}

	private static <E extends Comparable<E>> void heapSort(E[] list) {
		Heap<E> heap = new Heap<>();
		for (int i = 0; i < list.length; i++)
			heap.add(list[i]);
		for (int i = list.length - 1; i >= 0; i--)
			list[i] = heap.remove();
	}

	public static <E> void printArray(E[] array) {
		System.out.println("After heap sort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
