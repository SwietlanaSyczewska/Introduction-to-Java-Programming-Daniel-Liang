package Exercise_21_08;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;

/*********************************************************************************
 * (Count the occurrences of words in a text file) Rewrite Listing 21.9 to read
 * * the text from a text file. * Words are delimited by whitespace characters,
 * punctuation marks (,;.:?), * quotation marks ('"), and parentheses. Count
 * words in case-insensitive fashion* (e.g., consider Good and good to be the
 * same word). The words must start with * a letter. Display the output in
 * alphabetical order of words, with each word * preceded by its occurrence
 * count. *
 *********************************************************************************/

public abstract class Exercise_21_08 {

	public static void main(String[] args) {

		File file = new File("Chapter_21_Sets_and_Maps/Exercise_21_08/sample_text.txt");
		HashMap<String, Integer> map = getMap(file);
		TreeMap<String, Integer> sortedMap = sortedByValue(map);
		System.out.println(
				"Words sorted in the ascending order of their frequency. If they have the same frequancy, they are sorted in the natural order: \n"
						+ sortedMap);
	}

	private static TreeMap<String, Integer> sortedByValue(HashMap<String, Integer> map) {
		Comparator<String> comparator = new ValueComparator(map);
		TreeMap<String, Integer> result = new TreeMap<String, Integer>(comparator);
		result.putAll(map);
		return result;
	}

	private static HashMap<String, Integer> getMap(File file) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		try (Scanner input = new Scanner(file)) {
			while (input.hasNext()) {
				String word = input.next().replaceAll("[^a-zA-Z]", "").toLowerCase();
				if (!map.containsKey(word)) {
					map.put(word, 1);
				} else {
					int frequency = map.get(word);
					frequency++;
					map.put(word, frequency);
				}
			}
			map.remove("");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return map;
	}
}