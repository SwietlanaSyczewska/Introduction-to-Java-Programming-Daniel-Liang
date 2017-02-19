package Exercise_23_06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import Exercise_23_06.Circle;
import Exercise_23_06.GeometricObject;
import Exercise_23_06.Rectangle;

/*********************************************************************************
* (Check order) Write the following overloaded methods that check whether an     *
* array is ordered in ascending order or descending order. By default, the       *
* method checks ascending order. To check descending order, pass false to the    *
* ascending argument in the method.                                              *
*********************************************************************************/

public class Exercise_23_06 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//// Creating different arrays to check////
		Integer[] intArray = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
		Double[] doubleArray = { 2.4, -3.24, 2.36, 535.7, 62.9, 1.36, -2.111, 0.3, 14.2, 5.12 };
		Character[] charArray = { 's', 't', 'e', 'E', 'Q', 'a', 'R', 'W', 'h', 'G' };
		String[] stringArray = { "Ann", "Peter", "Catherine", "Anton", "Wor" };
		GeometricObject[] geometricObjectArray = { new Rectangle(5.3, 2.7), new Circle(9.3), new Rectangle(2.85, 4.3),
				new Circle(52.5), new Rectangle(3.73, 8.2), new Circle(9.2) };
		Integer[] intArrayAsc = Arrays.copyOf(intArray, intArray.length);
		Arrays.sort(intArrayAsc);
		Integer[] intArrayDesc = Arrays.copyOf(intArrayAsc, intArray.length);
		Arrays.sort(intArrayDesc, Collections.reverseOrder());
		Double[] doubleArrayAsc = Arrays.copyOf(doubleArray, doubleArray.length);
		Arrays.sort(doubleArrayAsc);
		Double[] doubleArrayDesc = Arrays.copyOf(doubleArrayAsc, doubleArray.length);
		Arrays.sort(doubleArrayDesc, Collections.reverseOrder());
		Character[] charArrayAsc = Arrays.copyOf(charArray, charArray.length);
		Arrays.sort(charArrayAsc);
		Character[] charArrayDesc = Arrays.copyOf(charArrayAsc, charArray.length);
		Arrays.sort(charArrayDesc);
		String[] stringArrayAsc = Arrays.copyOf(stringArray, stringArray.length);
		Arrays.sort(stringArrayAsc);
		String[] stringArrayDesc = Arrays.copyOf(stringArrayAsc, stringArray.length);
		Arrays.sort(stringArrayDesc, Collections.reverseOrder());
		GeometricObject[] geometricObjectArrayAsc = Arrays.copyOf(geometricObjectArray, geometricObjectArray.length);
		Arrays.sort(geometricObjectArrayAsc, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				double area1 = ((GeometricObject) o1).getArea();
				double area2 = ((GeometricObject) o2).getArea();
				if (area1 < area2) {
					return -1;
				} else if (area1 > area2) {
					return 1;
				} else {
					return 0;
				}
			}

		});

		GeometricObject[] geometricObjectArrayDesc = Arrays.copyOf(geometricObjectArrayAsc,
				geometricObjectArray.length);
		Arrays.sort(geometricObjectArrayDesc, new Comparator() {

			@Override
			public int compare(Object o2, Object o1) {
				double area1 = ((GeometricObject) o1).getArea();
				double area2 = ((GeometricObject) o2).getArea();
				if (area1 < area2) {
					return -1;
				} else if (area1 > area2) {
					return 1;
				} else {
					return 0;
				}
			}

		});

		printArray(intArrayAsc);
		printArray(intArrayDesc);
		printArray(doubleArrayAsc);
		printArray(doubleArrayDesc);
		printArray(charArrayAsc);
		printArray(charArrayDesc);
		printArray(stringArrayAsc);
		printArray(stringArrayDesc);
		printArray(geometricObjectArrayAsc);
		printArray(geometricObjectArrayDesc);

		System.out.println("intArrayAsc is" + (ordered(intArrayAsc) ? " " : " not ") + "ordered in ascending order.");

		System.out.println(
				"doubleArrayAsc is" + (ordered(doubleArrayAsc) ? " " : " not ") + "ordered in ascending order.");

		System.out
				.println("List3 is" + (ordered(intArrayDesc, false) ? " " : " not ") + "ordered in descending order.");

		System.out.println("doubleArrayDesc is" + (ordered(doubleArrayDesc, false) ? " " : " not ")
				+ "ordered in descending order.");

		System.out.println("charArrayAsc is" + (ordered(charArrayAsc) ? " " : " not ") + "ordered in ascending order.");

		System.out.println(
				"stringArrayAsc is" + (ordered(stringArrayAsc) ? " " : " not ") + "ordered in ascending order.");

		System.out.println(
				"charArrayDesc" + (ordered(charArrayDesc, false) ? " " : " not ") + "ordered in descending order.");

		System.out.println("stringArrayDesc is" + (ordered(stringArrayDesc, false) ? " " : " not ")
				+ "ordered in descending order.");

		System.out.println("intArray is" + (ordered(intArray) ? " " : " not ") + "ordered in ascending order.");

		System.out.println("charArray is" + (ordered(charArray) ? " " : " not ") + "ordered in ascending order.");

		System.out.println(
				"stringArray is" + (ordered(stringArray, false) ? " " : " not ") + "ordered in descending order.");

		System.out
				.println("charArray is" + (ordered(charArray, false) ? " " : " not ") + "ordered in descending order.");

		System.out.println("geometricObjectArrayAsc is"
				+ (ordered(geometricObjectArrayAsc, new GeometricObjectComparator()) ? " " : " not ")
				+ "ordered in ascending order.");

		System.out.println("geometricObjectArrayDesc is"
				+ (ordered(geometricObjectArrayDesc, new GeometricObjectComparator(), false) ? " " : " not ")
				+ "ordered in descending order.");

	}

	public static boolean ordered(int[] array, boolean ascending) {
		boolean descending = !ascending;
		for (int i = 0; i < array.length - 1; i++) {
			if (ascending && array[i] > array[i + 1]) {
				return false;
			} else if (descending && array[i] < array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean ordered(int[] array) {
		return ordered(array, true);
	}

	public static boolean ordered(double[] array, boolean ascending) {
		boolean descending = !ascending;
		for (int i = 0; i < array.length - 1; i++) {
			if (ascending && array[i] > array[i + 1]) {
				return false;
			} else if (descending && array[i] < array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean ordered(double[] array) {
		return ordered(array, true);
	}

	public static <E extends Comparable<E>> boolean ordered(E[] array) {
		return ordered(array, true);
	}

	public static <E extends Comparable<E>> boolean ordered(E[] array, boolean ascending) {
		boolean descending = !ascending;
		for (int i = 0; i < array.length - 1; i++) {
			if (ascending && array[i].compareTo(array[i + 1]) > 0) {
				return false;
			} else if (descending && array[i].compareTo(array[i + 1]) < 0) {
				return false;
			}
		}
		return true;
	}

	public static <E> boolean ordered(E[] list, Comparator<? super E> comparator) {
		return ordered(list, comparator, true);
	}

	public static <E> boolean ordered(E[] list, Comparator<? super E> comparator, boolean ascending) {
		boolean descending = !ascending;

		for (int i = 0; i < list.length - 1; i++) {
			if (ascending && comparator.compare(list[i], list[i + 1]) > 0)
				return false;
			else if (descending && comparator.compare(list[i], list[i + 1]) < 0)
				return false;
		}
		return true;
	}

	public static <E> void printArray(E[] array) {
		System.out.println("After sorting: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
