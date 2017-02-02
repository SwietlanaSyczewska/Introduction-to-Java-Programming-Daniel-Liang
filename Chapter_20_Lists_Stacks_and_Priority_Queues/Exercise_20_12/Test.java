package Exercise_20_12;

public class Test {

	public static void main(String[] args) {
		MyPriorityQueue<String> queue1 = new MyPriorityQueue<>();
		queue1.offer("a");
		queue1.offer("b");
		queue1.offer("c");
		MyPriorityQueue<String> queue2 = new MyPriorityQueue<>();
		try {
			queue2 = queue1.clone();
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		queue1.offer("d");
		queue1.offer("e");
		queue1.offer("f");
		queue2.remove();

		System.out.println("Queue1 " + queue1);
		System.out.println("Queue2 " + queue2);

	}

}
