package Exercise_23_11;

/***********************************************************************************
* (Heap clone and equals) Implement the clone and equals method in the Heap class. *
***********************************************************************************/

public class Exercise_23_11 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Character[] charArray1 = { 's', 't', 'e', 'E', 'Q', 'a', 'R', 'W', 'h', 'G' };
		Character[] charArray2 = { 'M', 'W', 'w', 'E', 'Q', 'a', 'R', 'W', 'h', 'G' };
		Heap<Character> heap1 = new Heap<>(charArray1);
		Heap<Character> heap2 = (Heap) heap1.clone();
		Heap<Character> heap3 = new Heap<>(charArray2);
		System.out.println("Heap1 is " + (heap1.equals(heap2) ? "" : "not ") + "equal to heap2");
		System.out.println("Heap2 is " + (heap2.equals(heap3) ? "" : "not ") + "equal to heap3");
	}

	public static <E> void printArray(E[] array) {
		System.out.println("After heap sort");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
