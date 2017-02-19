package Exercise_23_09;

import java.util.Comparator;

public class Exercise_23_09 {

	public static void main(String[] args) {
		GeometricObject[] geometricObjectArray = { new Rectangle(5.3, 2.7), new Circle(9.3), new Rectangle(2.85, 4.3),
				new Circle(52.5), new Rectangle(3.73, 8.2), new Circle(9.2) };
		sort(geometricObjectArray, new GeometricObjectComparator());
		printArray(geometricObjectArray);
	}

	private static <E> void sort(E[] array, Comparator<? super E> comparator) {
		Heap<E> heap = new Heap<>(comparator);
		for (int i = 0; i < array.length; i++)
			heap.add(array[i]);
		for (int i = array.length - 1; i >= 0; i--)
			array[i] = heap.remove();
	}

	public static <E> void printArray(E[] array) {
		System.out.println("After sorting: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
