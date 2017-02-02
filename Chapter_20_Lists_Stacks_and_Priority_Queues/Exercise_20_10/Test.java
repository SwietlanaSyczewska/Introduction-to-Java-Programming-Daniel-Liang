package Exercise_20_10;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Test {
	public static void main(String[] args) {
		PriorityQueue<String> queue1 = new PriorityQueue<>(
				Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
		PriorityQueue<String> queue2 = new PriorityQueue<>(
				Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

		System.out.println("Queue1" + queue1);
		System.out.println("Queue2" + queue2);
		System.out.println("Union of queues" + union(queue1, queue2));
		System.out.println("Difference of queues" + difference(queue1, queue2));
		System.out.println("Intersection of queues" + intersection(queue1, queue2));

	}

	private static <T> PriorityQueue<T> union(PriorityQueue<T> queue1, PriorityQueue<T> queue2) {
		PriorityQueue<T> union = new PriorityQueue<>(queue1);
		union.addAll(queue2);
		return union;
	}

	private static <T> PriorityQueue<T> difference(PriorityQueue<T> queue1, PriorityQueue<T> queue2) {
		PriorityQueue<T> difference = new PriorityQueue<>(queue1);
		difference.removeAll(queue2);
		return difference;
	}

	private static <T> PriorityQueue<T> intersection(PriorityQueue<T> queue1, PriorityQueue<T> queue2) {
		PriorityQueue<T> intersection = new PriorityQueue<>(queue1);
		intersection.retainAll(queue2);
		return intersection;
	}

}
