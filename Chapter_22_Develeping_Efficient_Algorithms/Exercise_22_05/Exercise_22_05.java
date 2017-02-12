package Exercise_22_05;

import java.util.Scanner;

/*******************************************************************************
 * (Same-number subsequence) Write an O(n) program that prompts the user to *
 * enter a sequence of integers ending with 0 and finds the longest subsequence*
 * with the same number. Here is a sample run of the program: *
 *******************************************************************************/

public class Exercise_22_05 {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();
		int[] values = longestSubsequence(number);
		System.out.print("The longest same number sequence starts at index " + values[0] + " with " + values[1]
				+ " values of " + values[2]);
	}

	private static int[] longestSubsequence(String string) {
		int length = 1;
		int maxFrequencyNum = string.charAt(0) - 48;
		int maxLength = 1;
		int index = 0;
		for (int i = 0; i < string.length() - 1; i++) {
			if (string.charAt(i) == string.charAt(i + 1)) {
				length++;
			} else {
				if (length > maxLength) {
					maxLength = length;
					index = i - length + 1;
					maxFrequencyNum = string.charAt(i - 1) - 48;
				}
			}
		}
		return new int[] { index, maxLength, maxFrequencyNum };
	}
}

/*********************************************************************************
 * Time complexity of this algorithm is O(n) - linear time, because there is * *
 * only one single loop and running time of the loop is directly * *
 * proportional to N. When N doubles so does the running time. * *
 *********************************************************************************/