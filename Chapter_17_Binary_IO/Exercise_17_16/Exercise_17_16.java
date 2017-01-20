package Exercise_17_16;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exercise_17_16 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Enter filename: ");
		File file = new File(new Scanner(System.in).nextLine());
		int[] ascii = new int[128];
		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))) {
			int buffer;
			while ((buffer = in.read()) != -1)
				ascii[buffer]++;
		}
		System.out.printf("%10s %10s %10s\n", "Character", "Count", "Ascii code");
		for (int i = 0; i < ascii.length; i++) {
			if (ascii[i] != 0) {
System.out.printf("%10c %10s %10s\n", i, ascii[i], i);
			}
		}
	}
}
