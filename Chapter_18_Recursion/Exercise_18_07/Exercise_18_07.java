package Exercise_18_07;

import java.util.Scanner;

public class Exercise_18_07 {
	public static int count = 0;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter fibonnacci number: ");
		int index = input.nextInt();
		System.out.println("The fibonnacci number at index " + index + " is " + fib(index));
		System.out.println("The fib method was called " + count + (count == 1 ? " time." : " times."));
	}

	private static long fib(int index) {
		count++;
		if (index == 0)
			return 0;
		else if (index == 1)
			return 1;
		else
			return fib(index - 1) + fib(index - 2);
	}
}
