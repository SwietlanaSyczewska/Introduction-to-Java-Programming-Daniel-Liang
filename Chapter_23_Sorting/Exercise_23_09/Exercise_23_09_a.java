package Exercise_23_09;

import java.util.Comparator;
import Exercise_23_09.Circle;
import Exercise_23_09.GeometricObject;
import Exercise_23_09.GeometricObjectComparator;
import Exercise_23_09.Rectangle;

/*********************************************************************************
* (Generic Heap using Comparator) Revise Heap in Listing 23.9, using a generic   *
* parameter and a Comparator for comparing objects. Define a new constructor     *
* with a Comparator as its argument as follows:                                  *
*                                                                                *
* Heap(Comparator<? super E> comparator)                                         *
*********************************************************************************/

public class Exercise_23_09_a {
	public static void main(String[] args) {
		GeometricObject[] geometricObjectArray = { new Rectangle(5.3, 2.7), new Circle(9.3), new Rectangle(2.85, 4.3),
				new Circle(52.5), new Rectangle(3.73, 8.2), new Circle(9.2) };
		sort(geometricObjectArray, new GeometricObjectComparator());
	}

	private static <E> void sort(E[] array, Comparator<? super E> comparator) {
		Heap<E> heap = new Heap<>(comparator);
		for (int i = 0; i < array.length; i++)
			heap.add(array[i]);
		for (int i = array.length - 1; i >= 0; i--)
			array[i] = heap.remove();
	}

	public static <E> void printArray(E[] array) {
		System.out.println("After heap sort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
