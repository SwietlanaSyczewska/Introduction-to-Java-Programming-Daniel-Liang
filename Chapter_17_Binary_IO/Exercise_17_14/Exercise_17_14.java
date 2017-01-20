package Exercise_17_14;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Exercise_17_14 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter input file name: ");
		String inputFile = input.nextLine();
		System.out.println("Enter output file name: ");
		String outputFile = input.nextLine();
		try (RandomAccessFile source = new RandomAccessFile(inputFile, "r");
				RandomAccessFile target = new RandomAccessFile(outputFile, "rw");) {
			int r = 0;
			source.seek(0);
			while ((r = source.read()) != -1) {
				target.write(((byte) r) + 5);
			}
		}

	}

}
