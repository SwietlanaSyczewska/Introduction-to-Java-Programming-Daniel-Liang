package Exercise_23_08;

/*********************************************************************************
* (Sort using a heap) Implement the following sort method using a heap.          *
*                                                                                *
* public static <E extends Comparable<E>> void sort(E[] list)                    *
*********************************************************************************/

public class Exercise_23_08 {
	public static void main(String[] args) {
		Double[] doubleArray = { 2.4, -3.24, 2.36, 535.7, 62.9, 1.36, -2.111, 0.3, 14.2, 5.12 };
		sort(doubleArray);
		printArray(doubleArray);
	}

	public static <E extends Comparable<E>> void sort(E[] array) {
		Heap<E> heap = new Heap<>();
		for (int i = 0; i < array.length; i++) {
			heap.add(array[i]);
		}
		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = heap.remove();
		}
	}

	public static <E> void printArray(E[] array) {
		System.out.println("After sorting: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
