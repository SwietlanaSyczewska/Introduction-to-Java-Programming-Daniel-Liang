package Exercise_24_01;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> extends MyAbstractList<E> {
	public static final int INITIAL_CAPACITY = 16;
	private E[] data = (E[]) new Object[INITIAL_CAPACITY];

	/** Create a default list */
	public MyArrayList() {
	}

	public MyArrayList(E[] objects) {
		for (int i = 0; i < objects.length; i++)
			add(objects[i]);
	}

	@Override
	public void add(int index, E e) {
		ensureCapacity();
		for (int i = size - 1; i >= index; i--)
			data[i + 1] = data[i];
		data[index] = e;
		size++;
	}

	private void ensureCapacity() {
		if (size >= data.length) {
			E[] newData = (E[]) (new Object[size * 2 + 1]);
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
	}

	@Override
	public void clear() {
		data = (E[]) new Object[INITIAL_CAPACITY];
		size = 0;
	}

	@Override
	public boolean contains(E e) {
		for (int i = 0; i < size; i++) {
			if (e.equals(data[i]))
				return true;
		}
		return false;
	}

	@Override
	public E get(int index) {
		checkIndex(index);
		return data[index];
	}

	private void checkIndex(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Index" + index + " out of bounds");
	}

	@Override
	public int indexOf(E e) {
		for (int i = 0; i < size; i++) {
			if (e.equals(data[i]))
				return i;
		}
		return -1;
	}

	@Override
	public int lastIndexOf(E e) {
		for (int i = size - 1; i >= 0; i--) {
			if (e.equals(data[i]))
				return i;
		}
		return -1;
	}

	@Override
	public E remove(int index) {
		checkIndex(index);
		E e = data[index];
		for (int j = index; j < size - 1; j++)
			data[j] = data[j + 1];
		data[size - 1] = null;
		size--;
		return e;
	}

	@Override
	public boolean addAll(MyList<E> otherList) {
		int previousSize = this.size();

		for (int i = 0; i < otherList.size(); i++) {
			this.add(otherList.get(i));
		}
		if (this.size() - previousSize == this.size()) {
			return true;
		} else
			return false;
	}

	public boolean removeAll(MyList<E> otherList) {
		boolean changed = false;
		for (int i = 0; i < otherList.size(); i++) {
			if (this.contains(otherList.get(i))) {
				this.remove(otherList.get(i));
				changed = true;
			}
		}
		return changed;
	}

	public boolean retainAll(MyList<E> otherList) {
		boolean changed = false;
		for (int i = size - 1; i >= 0; i--) {
			E e = get(i);
			if (!otherList.contains(e)) {
				remove(i);
				changed = true;
			}
		}
		return changed;
	}

	@Override
	public E set(int index, E e) {
		checkIndex(index);
		E old = data[index];
		data[index] = e;
		return old;
	}

	@Override
	public java.util.Iterator<E> iterator() {
		return new ArrayListIterator();
	}

	public void trimToSize() {
		if (size != data.length) {
			E[] newData = (E[]) (new Object[size]);
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
	}

	private class ArrayListIterator implements java.util.Iterator<E> {
		private int current = 0;

		@Override
		public boolean hasNext() {
			return (current < size);
		}

		@Override
		public E next() {
			return data[current++];
		}
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		for (int i = 0; i < size; i++) {
			result.append(data[i]);
			if (i < size - 1)
				result.append(",");
		}
		return result.toString() + "]";
	}
}