package Exercise_24_04;

/*
(Use the GenericStack class) Write a program that displays the first 50 prime
numbers in descending order. Use a stack to store the prime numbers.
 */
import java.util.ArrayList;

public class Exercise_24_04 {
	public static void main(String[] args) {
		GenericStack<Integer> stack = findPrimaryNumber(50);
		// System.out.println(stack.getSize());
		int size = stack.getSize();
		for (int i = 0; i < size; i++) {
			System.out.print(stack.pop() + " ");
		}
	}

	private static GenericStack<Integer> findPrimaryNumber(int n) {
		int number = 2;
		GenericStack<Integer> stack = new GenericStack<Integer>();
		while (number <= n) {
			boolean isPrime = true;
			// System.out.println((int)Math.sqrt(number));
			for (int divisor = 2; divisor <= (int) (Math.sqrt(number)); divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				// System.out.println(number);
				stack.push(number);
			}
			number++;
		}
		return stack;
	}
}
