package Exercise_22_03;

import java.util.Scanner;

/*********************************************************************************
* (Pattern matching) Write a program that prompts the user to enter two strings  *
* and tests whether the second string is a substring of the first string.        *
* Suppose the neighboring characters in the string are distinct. (Don’t use the  *
* indexOf method in the String class.) Analyze the time complexity of your       *
* algorithm. Your algorithm needs to be at least O(n) time.                      *
*********************************************************************************/
public class Exercise_22_03 {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		System.out.println("Enter a subString");
		String substring = input.nextLine();
		int indexMatch = findIndexMatch(string, substring);
		String match = match = (indexMatch >= 0) ? indexMatch + "" : "no match";
		System.out.print("Matched at index: " + match);
	}

	private static int findIndexMatch(String string, String substring) {
		int length = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == substring.charAt(0)) {
				for (int j = 0; j < substring.length(); j++) {
					System.out.println("From string " + string.charAt(i) + ", from substring " + substring.charAt(j)
							+ ", i = " + i + " j = " + j + " length " + length);
					if (string.charAt(i) == substring.charAt(j)) {
						i++;
						length++;

					}
					if (length == substring.length()) {
						return i - length;
					}
				}
			}
		}
		return -1;
	}
}

/*********************************************************************************
 * Time complexity of this algorithm is O(n^2) - quadratic time, because there   *
 * are two nested loops and the running time of theses two loops is proportional *
 * to the square of N. When N double, the running time increases by N * N.       *
 *********************************************************************************/
