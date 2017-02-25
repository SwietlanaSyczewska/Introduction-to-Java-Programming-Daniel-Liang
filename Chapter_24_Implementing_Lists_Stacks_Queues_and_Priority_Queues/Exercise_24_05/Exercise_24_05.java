package Exercise_24_05;

/*
(Implement GenericQueue using inheritance) In Section 24.5, Stacks and
Queues, GenericQueue is implemented using composition. Define a new queue
class that extends java.util.LinkedList.
*/
public class Exercise_24_05 {
	public static void main(String[] args) {
		GenericQueue<String> queue = new GenericQueue<>();

		// Add elements to the queue
		queue.enqueue("Tom"); // Add it to the queue
		System.out.println("Adding Tom " + queue);

		queue.enqueue("Susan"); // Add it to the queue
		System.out.println("Adding Susan " + queue);

		queue.enqueue("Kim"); // Add it to the queue
		queue.enqueue("Michael"); // Add it to the queue
		System.out.println("Adding Kim and Michael " + queue);
		System.out.println("Size is " + queue.getSize());

		// Remove elements from the queue
		System.out.println("Removing " + queue.dequeue());
		System.out.println("Removing " + queue.dequeue());
		System.out.println("Queue: " + queue);

	}

}
