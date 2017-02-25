package Exercise_24_06;
/*
(Generic PriorityQueue using Comparator) Revise MyPriorityQueue
in Listing 24.9, using a generic parameter for comparing objects. Define a new
constructor with a Comparator as its argument as follows:
PriorityQueue(Comparator<? super E> comparator)
*/
public class Exercise_24_06 {

	public static void main(String[] args) {
		GeometricObject geometricObject1 = new Circle(5);
		GeometricObject geometricObject2 = new Rectangle(5, 3);
		GeometricObject geometricObject3 = new Circle(7);
		GeometricObject geometricObject4 = new Rectangle(2, 9);
		GeometricObject geometricObject5 = new Circle(2);
		GeometricObject geometricObject6 = new Rectangle(10, 1);
		GeometricObject geometricObject7 = new Circle(11);
		PriorityQueue priorityQueue = new PriorityQueue(new GeometricObjectComparator());
		priorityQueue.enqueue(geometricObject1);
		priorityQueue.enqueue(geometricObject2);
		priorityQueue.enqueue(geometricObject3);
		priorityQueue.enqueue(geometricObject4);
		priorityQueue.enqueue(geometricObject5);
		priorityQueue.enqueue(geometricObject6);
		priorityQueue.enqueue(geometricObject7);
		int size = priorityQueue.getSize();
		for (int i = 0; i < size; i++) {
			System.out.println(((GeometricObject) priorityQueue.dequeue()).getArea());
		}
	}
}
