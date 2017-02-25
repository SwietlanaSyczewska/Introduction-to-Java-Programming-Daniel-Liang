package Exercise_24_02;
/*
 * (Implement MyLinkedList) The implementations of the methods
contains(E e), get(int index), indexOf(E e), lastIndexOf(E e),
and set(int index, E e) are omitted in the text. Implement these methods.
*/
public class Exercise_24_02 {

	public static void main(String[] args) {
		MyList<String> list1 = new MyLinkedList<>(new String[] { "Tom", "George", "Peter", "Jean", "Jane", "Tom",
				"George", "Michael", "Michelle", "Daniel" });
		System.out.println("List1: " + list1);
		System.out.println("Does list1 contain Michelle? " + list1.contains("Michelle"));
		System.out.println("Does list1 contain Edward? " + list1.contains("Edward"));
		System.out.println("Value at index 5? " + list1.get(5));
		System.out.println("Value at index 100? " + list1.get(100));
		System.out.println("First index of George? " + list1.indexOf("George"));
		System.out.println("Last index of George? " + list1.lastIndexOf("George"));
		System.out.println("After setting inedx 7 to Angela");
		list1.set(7, "Angela");
		System.out.println(list1);
	}

}
