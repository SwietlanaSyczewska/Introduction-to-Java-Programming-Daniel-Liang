package Exercise_21_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

import Exercise_21_08.ValueComparator;

/*********************************************************************************
 * (Count the occurrences of each keyword) Rewrite Listing 21.7 CountKeywords. *
 * java to read in a Java source code file and count the occurrence of each *
 * keyword in the file, but don’t count the keyword if it is in a comment or in
 * a * string literal. *
 *********************************************************************************/
public class Exercise_21_10 {

	public static void main(String[] args) {
		String[] keywordsArray = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
				"const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
				"float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
				"new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
				"true", "false", "null" };
		File file = new File("Chapter_18_Recursion/Exercise_18_07/Exercise_18_07.java");
		HashSet<String> keywords = new HashSet<String>(Arrays.asList(keywordsArray));
		HashMap<String, Integer> keywordFrequency = getKeywordsFrequency(file, keywords);
		Comparator<String> comparator = new ValueComparator(keywordFrequency);
		TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(comparator);
		sortedMap.putAll(keywordFrequency);

		System.out.println(
				"Words sorted in the ascending order of their frequency. If they have the same frequancy, they are sorted in the natural order: \n"
						+ sortedMap);
	}

	private static HashMap<String, Integer> getKeywordsFrequency(File file, HashSet<String> keywords) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		try (Scanner input = new Scanner(file)) {
			while (input.hasNext()) {
				String str = input.next();
				if (str.equals("/*")) {
					while (!input.next().equals("*/")) {
						input.next();
					}
				}
				if (str.equals("//")) {
					input.nextLine();
				}

				if (keywords.contains(str)) {
					int count = 0;
					if (map.containsKey(str)) {
						count = map.get(str);
					}
					count++;
					map.put(str, count);
				}
			}

		} catch (

		FileNotFoundException e) {
			e.printStackTrace();
		}
		return map;
	}

}
