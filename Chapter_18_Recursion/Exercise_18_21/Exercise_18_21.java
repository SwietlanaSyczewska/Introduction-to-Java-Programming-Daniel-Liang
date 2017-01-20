package Exercise_18_21;

import java.util.Scanner;

public class Exercise_18_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter decimal:");
		int value = input.nextInt();
		System.out.println("The binary equivalnet of " + value + " is " + dec2Bin(value));

	}

	public static String dec2Bin(int value) {
		String result = "";
		return dec2Bin(value, result);
	}

	public static String dec2Bin(int value, String result) {
		if (value / 2 == 0)
			return (value % 2) + result;
		else
			return dec2Bin(value / 2, (value % 2) + result);
	}

}
