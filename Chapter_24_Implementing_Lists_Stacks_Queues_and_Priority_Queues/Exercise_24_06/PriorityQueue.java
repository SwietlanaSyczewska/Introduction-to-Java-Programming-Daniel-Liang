package Exercise_24_06;

import java.util.Comparator;

public class PriorityQueue<E> {
	private Comparator<? super E> comparator;
	private Heap<E> heap;

	PriorityQueue(Comparator<? super E> comparator) {
		this.comparator = comparator;
		this.heap = new Heap<>(comparator);
	}

	public void enqueue(E newObject) {
		heap.add(newObject);
	}

	public E dequeue() {
		return heap.remove();
	}

	public int getSize() {
		return heap.getSize();
	}
}
