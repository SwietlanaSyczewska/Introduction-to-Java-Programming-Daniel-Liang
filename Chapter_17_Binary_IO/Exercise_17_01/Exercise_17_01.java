package Exercise_17_01;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_17_01 {
	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("src/Exercise_17_01.txt");

		try (PrintWriter printwriter = new PrintWriter(file)) {
			for (int i = 0; i < 100; i++) {

				printwriter.write((int) (Math.random() * 10) + " ");
				if ((i + 1) % 3 == 0)
					printwriter.println();

			}
		}
	}
}