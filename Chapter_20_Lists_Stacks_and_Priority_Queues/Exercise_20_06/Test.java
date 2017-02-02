package Exercise_20_06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 500000; i++) {
			arrayList.add(i);
		}
		LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
		long timerStartIterator = System.currentTimeMillis();
		ListIterator<Integer> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			listIterator.next();
		}
		long timerEndIterator = System.currentTimeMillis();
		System.out.println((timerEndIterator - timerStartIterator) + " miliseconds for traversing with iterator");
		long timerStartGetIndexMethod = System.currentTimeMillis();

		for (int i = 0; i < 500000; i++) {
			linkedList.get(i);
		}
		long timerEndGetIndexMethod = System.currentTimeMillis();
		System.out.println(
				(timerEndGetIndexMethod - timerStartGetIndexMethod) + " miliseconds for traversing with get(index)");
	}
}
