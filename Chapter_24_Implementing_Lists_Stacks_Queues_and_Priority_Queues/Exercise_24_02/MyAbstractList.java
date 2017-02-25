package Exercise_24_02;

public abstract class MyAbstractList<E> implements MyList<E> {
	protected int size = 0; // The size of the list

	protected MyAbstractList() {
	}

	protected MyAbstractList(E[] objects) {
		for (int i = 0; i < objects.length; i++)
			add(objects[i]);
	}

	public void add(E e) {
		add(size, e);
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean remove(E e) {
		if (indexOf(e) >= 0) {
			remove(indexOf(e));
			return true;
		} else
			return false;
	}

	public int size() {
		return size;
	}

}
