package Exercise_21_06;
/**********************************************************************************
* (Count the occurrences of numbers entered) Write a program that reads an        *
* unspecified number of integers and finds the one that has the most occurrences. *
* The input ends when the input is 0. For example, if you entered 2 3 40 3 5 4 –3 *
* 3 3 2 0, the number 3 occurred most often. If not one but several numbers have  *
* the most occurrences, all of them should be reported. For example, since 9 and  *
* 3 appear twice in the list 9 30 3 9 3 2 4, both occurrences should be reported. *
**********************************************************************************/

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public abstract class Test {

	public static void main(String[] args) {

		HashMap<Integer, Integer> map = getMap();
		int max = Collections.max(map.values());
		System.out.println("Integers with most occurences : ");
		for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max) {
				System.out.println("Integer: " + entry.getKey() + " | Occurences: " + entry.getValue());
			}
		}
	}

	private static HashMap<Integer, Integer> getMap() {
		System.out.println("Enter numbers. Print 0 to quit");
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner input = new Scanner(System.in);
		int key;
		while ((key = input.nextInt()) != 0) {
			if (!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				int frequency = map.get(key);
				frequency++;
				map.put(key, frequency);
			}
		}
		return map;
	}

}
