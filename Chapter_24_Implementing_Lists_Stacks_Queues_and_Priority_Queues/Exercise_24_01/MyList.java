package Exercise_24_01;

public interface MyList<E> extends java.lang.Iterable<E> {

	public void add(E e);

	public void add(int index, E e);

	public void clear();

	public boolean contains(E e);

	public E get(int index);

	public int indexOf(E e);

	public boolean isEmpty();

	public int lastIndexOf(E e);

	public boolean remove(E e);

	public E remove(int index);

	public Object set(int index, E e);

	public int size();

	public boolean retainAll(MyList<E> list2);

	public boolean removeAll(MyList<E> list2);

	public boolean addAll(MyList<E> list2);
}
