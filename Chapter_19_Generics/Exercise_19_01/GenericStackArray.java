package Exercise_19_01;

public class GenericStackArray<E> {
	@SuppressWarnings("unchecked")
	private E[] list = (E[]) new Object[10];
	private int size = 0;

	public int getSize() {
		return size;
	}

	public E peek() {
		return list[size - 1];
	}

	public void push(E o) {
		if (size >= list.length) {
			doubleList();
		}
		list[size++] = o;
	}

	public E pop() {
		E o = list[--size];
		return o;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@SuppressWarnings("unchecked")
	private void doubleList() {
		E[] tempList = (E[]) new Object[list.length * 2];
		System.arraycopy(list, 0, tempList, 0, list.length);
		list = tempList;
	}

	public String toString() {
		return "stack: " + list.toString();
	}

}
