package Exercise_19_09;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arrayList.add(i);
		}

		System.out.println(Arrays.toString(arrayList.toArray()));
		shuffle(arrayList);
		System.out.println(Arrays.toString(arrayList.toArray()));
		sort(arrayList);
		System.out.println(Arrays.toString(arrayList.toArray()));

	}

	public static <E> void shuffle(ArrayList<E> list) {
		for (int i = 0; i < list.size(); i++) {
			int random = (int) (Math.random() * list.size());
			E tmp = list.get(random);
			list.set(random, list.get(i));
			list.set(i, tmp);
		}
	}

	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		E temp;
		int first;
		int i;
		int j;
		 for (i = list.size() - 1; i > 0; i--) {
		 first = 0;
		 for (j = 1; j <= i; j++)

				{
				if (list.get(j).compareTo(list.get(first)) < 0)
					first = j;
			}

			temp = list.get(first);

			list.set(first, list.get(i));
			list.set(i, temp);

		}

	}
}
