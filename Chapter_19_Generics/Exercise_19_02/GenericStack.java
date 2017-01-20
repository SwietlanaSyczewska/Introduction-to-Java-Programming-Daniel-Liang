package Exercise_19_02;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class GenericStack<E> extends ArrayList<E> {
	public E peek() {
		return get(size() - 1);
	}

	public void push(E o) {
		add(o);
	}

	public E pop() {
		E o = get(size() - 1);
		remove(size() - 1);
		return o;
	}

	public String toString() {
		return "Stack: " + super.toString();
	}

}
