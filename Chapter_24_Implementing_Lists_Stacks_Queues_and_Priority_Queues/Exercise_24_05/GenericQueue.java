package Exercise_24_05;

public class GenericQueue<E> extends java.util.LinkedList {
	public void enqueue(E e) {
		addLast(e);
	}

	public E dequeue() {
		return (E) removeFirst();
	}

	public int getSize() {
		return size();
	}

	}
