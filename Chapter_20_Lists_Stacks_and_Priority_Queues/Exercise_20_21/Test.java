package Exercise_20_21;

import java.util.Comparator;

public class Test {

	public static void main(String[] args) {

		GeometricObject[] array = { new Rectangle(43, 34), new Rectangle(94, 5), new Rectangle(73, 52),
				new Rectangle(16, 62), new Rectangle(15, 36), new Rectangle(51, 3), new Circle(51), new Circle(634),
				new Circle(5), new Circle(37), new Circle(3), new Circle(83) };
		System.out.println("Before sort: ");
		for (GeometricObject o : array) {
			System.out.println(o.getArea());
		}
		selectionSort(array, new GeometricObjectComparator());

		System.out.println("After sort: ");
		for (GeometricObject o : array) {
			System.out.println(o.getArea());
		}

	}

	public static <E> void selectionSort(E[] arr, Comparator<? super E> comparator) {
		for (int i = 0; i < arr.length - 1; i++) {
			E currentMin = arr[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (comparator.compare(currentMin, arr[j]) > 0) {
					currentMin = arr[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				arr[currentMinIndex] = arr[i];
				arr[i] = currentMin;
			}
		}
	}
}
