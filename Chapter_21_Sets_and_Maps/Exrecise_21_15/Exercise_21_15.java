package Exrecise_21_15;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise_21_15 {

	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		Set<Integer> answers = new HashSet<Integer>();
		Scanner input = new Scanner(System.in);
		int answer;
		System.out.println("Enter the sum of " + number1 + " + " + number2 + ": ");
		while ((answer = input.nextInt()) != number1 + number2) {
			if (answers.contains(answer)) {
				System.out.println("You already put that number. Try again");
			} else {
				System.out.println("Wrong. Try again");
				answers.add(answer);
			}
		}
		
	}

}
