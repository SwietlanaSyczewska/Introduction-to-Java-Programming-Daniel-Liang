package Exercise_21_04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		TreeSet<String> vowels = new TreeSet<String>(Arrays.asList(new String[] { "a", "e", "i", "o", "u" }));
		TreeSet<String> vowelsInText = new TreeSet<String>();
		TreeSet<String> consanantsInText = new TreeSet<String>();
		File file = new File("src/Exercise_20_01_text_sample.txt");
		try (Scanner input = new Scanner(file)) {
			while (input.hasNext()) {
				String str = input.next().replaceAll("[^a-zA-Z]", "").toLowerCase();
				for (char ch : str.toCharArray()) {
					String character = ch + "";
					if (vowels.contains(character)) {
						vowelsInText.add(character);
					} else {
						consanantsInText.add(character);
					}
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("All vowels in the text: " + vowelsInText);
		System.out.println("All vowels in the text: " + consanantsInText);

	}

}
