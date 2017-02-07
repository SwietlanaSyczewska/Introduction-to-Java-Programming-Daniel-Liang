package Exercise_17_15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Exercise_17_15 {
			// C:\\Users\\swiet\\workspace\\Introduction to Java Programming Daniel Liang\\src\Exercise_17_14.dat
	// C:\\Users\\swiet\\workspace\\Introduction to Java Programming Daniel Liang\\src\Exercise_17_15.dat
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter input file name: ");
		String inputFile = input.nextLine();
		System.out.println("Enter output file");
		String outputFile = input.nextLine();
		try (RandomAccessFile encrypted = new RandomAccessFile(inputFile, "r");
				RandomAccessFile decrypted = new RandomAccessFile(outputFile, "rw");) {
			int r = 0;
			encrypted.seek(0);
			while ((r = encrypted.read()) != -1) {
				decrypted.write(((byte) r) - 5);

			}

		}
	}
}
