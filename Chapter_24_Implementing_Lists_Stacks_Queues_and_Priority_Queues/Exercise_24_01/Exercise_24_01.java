
package Exercise_24_01;

/*(Add set operations in MyList) Define the following methods in MyList and
implement them in MyAbstractList:

public boolean addAll(MyList<E> otherList);

public boolean removeAll(MyList<E> otherList);

public boolean retainAll(MyList<E> otherList);
Write a test program that creates two MyArrayLists, list1 and list2, with
the initial values {"Tom", "George", "Peter", "Jean", "Jane"} and
{"Tom", "George", "Michael", "Michelle", "Daniel"}, then perform
the following operations:
 Invokes list1.addAll(list2), and displays list1 and list2.
 Recreates list1 and list2 with the same initial values, invokes
list1.removeAll(list2), and displays list1 and list2.
 Recreates list1 and list2 with the same initial values, invokes
list1.retainAll(list2), and displays list1 and list2.
*/
public class Exercise_24_01 {

	public static void main(String[] args) {
		MyList<String> list1 = new MyArrayList<>(new String[] { "Tom", "George", "Peter", "Jean", "Jane" });
		MyList<String> list2 = new MyArrayList<>(new String[] { "Tom", "George", "Michael", "Michelle", "Daniel" });
		System.out.println("First list: " + list1);
		System.out.println("Second list: " + list2);
		list1.retainAll(list2);
		System.out.println("First list: " + list1);
		System.out.println("Second list: " + list2);
		System.out.println("Invoke list1.addAll(list2)");
		list1.addAll(list2);
		System.out.println("First list: " + list1);
		System.out.println("Second list: " + list2);
		list1 = new MyArrayList<>(new String[] { "Tom", "George", "Peter", "Jean", "Jane" });
		list2 = new MyArrayList<>(new String[] { "Tom", "George", "Michael", "Michelle", "Daniel" });
		System.out.println("Recreating list1 and list2");
		System.out.println("Invoke list1.removeAll(list2)");
		list1.removeAll(list2);
		System.out.println("First list: " + list1);
		System.out.println("Second list: " + list2);
		list1 = new MyArrayList<>(new String[] { "Tom", "George", "Peter", "Jean", "Jane" });
		list2 = new MyArrayList<>(new String[] { "Tom", "George", "Michael", "Michelle", "Daniel" });
		System.out.println("Recreating list1 and list2");
		System.out.println("Invoke list1.retainAll(list2)");
	}

}
