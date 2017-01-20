package Exercise_19_06;

public class Test {

	public static void main(String[] args) {
		Integer[][] list = new Integer[10][10];
		int value = 0;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				list[i][j] = value++;
			}

		}
		System.out.println("Max = " + max(list));

	}

	public static <E extends Comparable<E>> E max(E[][] list) {
		E max = list[0][0];
		for (E[] x : list) {
			for (E y : x) {
				if (y.compareTo(max) > 0) {
					max = y;
				}
			}
		}
		return max;
	}

}
