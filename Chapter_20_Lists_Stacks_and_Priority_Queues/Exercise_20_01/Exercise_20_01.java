package Exercise_20_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.InvalidParameterException;
import java.util.PriorityQueue;

public class Exercise_20_01 {
	public static void main(String[] args) throws Exception {
		// "src/Exercise_20_01_text_sample.txt";
		if (args.length != 1) {
			throw new InvalidParameterException("Usage: Exercise_01 filename");
		}
		File textFile = new File(args[0]);

		if (!textFile.exists()) {
			throw new FileNotFoundException("The file" + args[0] + "doesn`t exist");
		}

		PriorityQueue<String> priorityQueue = new PriorityQueue<>(1000, String.CASE_INSENSITIVE_ORDER);
		try (BufferedReader input = new BufferedReader(new FileReader(textFile))) {
			String str;
			while ((str = input.readLine()) != null) {
				String[] arrayOfWords = str.split(" ");
				for (String word : arrayOfWords) {
					if (word.length() > 0 && Character.isLetter(word.charAt(0))) {
						priorityQueue.add(word);
					}
				}
			}

		}
		while (priorityQueue.size() > 0) {
			System.out.println(priorityQueue.poll());
		}
	}
}