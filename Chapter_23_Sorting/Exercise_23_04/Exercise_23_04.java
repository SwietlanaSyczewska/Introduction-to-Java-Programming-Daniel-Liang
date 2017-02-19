package Exercise_23_04;

/*********************************************************************************
* (Improve quick sort) The quick sort algorithm presented in the book selects    *
* the first element in the list as the pivot. Revise it by selecting the median  *
* among the first, middle, and last elements in the list.                        *
*********************************************************************************/

public class Exercise_23_04 {
	public static void main(String[] args) {
		int[] intArray = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };

		quickSort(intArray);

		printArray(intArray);

	}

	private static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	public static void quickSort(int[] array, int first, int last) {
		if (last > first) {
			int pivotIndex = partition(array, first, last);
			quickSort(array, first, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, last);
		}
	}

	private static int partition(int[] array, int first, int last) {
		int middle = array[(array.length - 1) / 2];
		int pivot = findMedian(first, middle, last);
		int low = first + 1;
		int high = last;
		while (high > low) {
			while (low <= high && array[low] <= pivot)
				low++;
			while (low <= high && array[high] > pivot)
				high--;
			if (high > low) {
				int temp = array[high];
				array[high] = array[low];
				array[low] = temp;
			}
		}
		while (high > first && array[high] >= pivot)
			high--;
		if (pivot > array[high]) {
			array[first] = array[high];
			array[high] = pivot;
			return high;
		} else {
			return first;
		}
	}

	public static void printArray(int[] array) {
		System.out.println("After merge sort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static int findMedian(int first, int middle, int last) {
		if (first > middle) {
			if (middle > last) {
				return middle;
			} else if (first > last) {
				return last;
			} else {
				return first;
			}
		} else {
			if (first > last) {
				return first;
			} else if (middle > last) {
				return last;
			} else {
				return middle;
			}
		}

	}
}
