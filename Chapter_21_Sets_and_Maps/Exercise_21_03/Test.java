package Exercise_21_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public abstract class Test {

	public static void main(String[] args) {
		String[] keywordsArray = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
				"const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
				"float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
				"new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
				"true", "false", "null" };

		HashSet<String> keywords = new HashSet<String>(Arrays.asList(keywordsArray));
		File file = new File("Chapter_18_Recursion/Exercise_18_07/Exercise_18_07.java");
		int count = 0;
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
					System.out.println(str);
					count++;
				}
			}

		} catch (

		FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("There are " + count + " keywords in a source file");

	}

}
