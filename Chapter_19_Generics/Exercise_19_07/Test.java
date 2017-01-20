package Exercise_19_07;

public class Test {
	public static void main(String[] args) {
		Integer[] arr = new Integer[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < arr.length + 2; i++) {
			System.out.println("Index is " + binarySearch(arr, i));
		}
	}

	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int middle = (low + high) / 2;

			if (key.compareTo(list[middle]) == 0) {
				return middle;
			} else if (key.compareTo(list[middle]) < 0) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		return -low - 1;
	}

}
