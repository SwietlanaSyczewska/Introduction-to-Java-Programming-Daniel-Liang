package Exercise_21_02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		TreeSet<String> words = new TreeSet<String>();
		File file = new File("src/Exercise_20_01_text_sample.txt");
		try (Scanner input = new Scanner(file)) {
			while (input.hasNext()) {
				words.add(input.next().replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
				words.remove("");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("All words in the file  in alphabetical order: \n" + words);

	}

}
