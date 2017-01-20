package Exercise_19_02;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		GenericStack<String> stack = new GenericStack<>();
		System.out.print("Enter five strings: ");
		for (int i = 0; i < 5; i++)
			stack.push(input.next());
		while (!stack.isEmpty())
			System.out.print(stack.pop() + " ");
		System.out.println();
	}

}
