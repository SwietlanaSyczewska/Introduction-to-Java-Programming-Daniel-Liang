package Exercise_22_01;

import java.util.Scanner;

/*********************************************************************************
 * (Maximum consecutive increasingly ordered substring) Write a program that     *
 * prompts the user to enter a string and displays the maximum consecutive       *
 * increasingly ordered substring. Analyze the time complexity of your program.  *
 *********************************************************************************/

public class Exercise_22_01 {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		System.out.println(findIncreasinglyOrderedSubstring(string));
	}

	private static String findIncreasinglyOrderedSubstring(String string) {
		String oldString = "";
		String newString = "";
		newString = string.charAt(0) + "";
		for (int i = 0; i < string.length() - 1; i++) {
			if ((string.charAt(i + 1) > string.charAt(i))) {
				newString += string.charAt(i + 1);
			} else {
				if (oldString.length() < newString.length()) {
					oldString = newString;
				}
				newString = string.charAt(i + 1) + "";
			}
			if (i == string.length() - 2) {
				if (oldString.length() < newString.length()) {
					oldString = newString;
				}
			}
		}
		return oldString;
	}
}

/*********************************************************************************
 * Time complexity of this algorithm is O(n) - linear time, because there is * *
 * only one single loop and running time of the loop is directly * *
 * proportional to N. When N doubles so does the running time. * *
 *********************************************************************************/
