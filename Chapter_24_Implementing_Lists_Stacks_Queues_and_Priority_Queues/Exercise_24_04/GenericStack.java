package Exercise_24_04;

public class GenericStack<E> {
	private java.util.ArrayList<E> list = new java.util.ArrayList<>();

	public int getSize() {
		return list.size();
	}

	public E peek() {
		return list.get(getSize() - 1);
	}

	public void push(E o) {
		list.add(o);
	}

	public E pop() {
		int size = getSize();
		E o = list.get(size - 1);
		list.remove(size - 1);
		return o;
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public String toString() {
		return "stack: " + list.toString();
	}
}
