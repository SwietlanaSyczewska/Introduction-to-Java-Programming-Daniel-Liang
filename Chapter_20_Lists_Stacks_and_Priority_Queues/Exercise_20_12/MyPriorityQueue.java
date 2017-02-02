package Exercise_20_12;

import java.util.PriorityQueue;

public class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable {
	public MyPriorityQueue<E> clone() throws CloneNotSupportedException {
		MyPriorityQueue<E> queue = new MyPriorityQueue<>();
		queue.addAll((MyPriorityQueue<E>)super.clone()); 
		return queue;
	}
}
