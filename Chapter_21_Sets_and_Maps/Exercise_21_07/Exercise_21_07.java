package Exercise_21_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/*********************************************************************************
 * Display the words in ascending order of occurrence counts. (Hint: Create a
 * class named WordOccurrence that implements the Comparable interface. The
 * class contains two fields, word and count. The compareTo method compares the
 * counts. For each pair in the hash set in Listing 21.9, create an instance of
 * WordOccurrence and store it in an array list. Sort the array list using the
 * Collections.sort method. What would be wrong if you stored the instances of
 * WordOccurrence in a tree set?)
 *********************************************************************************/
public class Exercise_21_07 {
	public static void main(String[] args) {

		File file = new File("Chapter_21_Sets_and_Maps/Exercise_21_07/sample_text.txt");
		HashMap<String, Integer> wordsCounts = getMap(file);
		ArrayList<WordOccurence> list = new ArrayList<>();
		for (HashMap.Entry<String, Integer> entry : wordsCounts.entrySet()) {
			list.add(new WordOccurence(entry.getKey(), entry.getValue()));
		}
		Collections.sort(list);
		System.out.println("Words sorted in the ascending order of their frequency: \n" + list);
	}

	private static HashMap<String, Integer> getMap(File file) {
		HashMap<String, Integer> wordsMap = new HashMap<String, Integer>();
		try (Scanner input = new Scanner(file)) {
			while (input.hasNext()) {
				String word = input.next().replaceAll("[^a-zA-Z]", "").toLowerCase();
				if (!wordsMap.containsKey(word)) {
					wordsMap.put(word, 1);
				} else {
					int frequency = wordsMap.get(word);
					frequency++;
					wordsMap.put(word, frequency);
				}
			}
			wordsMap.remove("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return wordsMap;
	}
}