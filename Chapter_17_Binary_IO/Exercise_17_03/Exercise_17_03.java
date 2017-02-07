package Exercise_17_03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_17_03 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path = ("src/Exercise_17_03.dat");
		File file = new File(path);

		int limit = 5;

		try (Scanner inputConsole = new Scanner(System.in);
				DataOutputStream output = new DataOutputStream(new FileOutputStream(path))) {
			while (limit != 0) {
				System.out.println("Provide integer:");
				output.writeInt(inputConsole.nextInt());
				limit--;
			}
		}

		try (DataInputStream input = new DataInputStream(new FileInputStream(path))) {
			while (true) {
				System.out.print(input.readInt() + " ");

			}
		} catch (EOFException ex) {

		}
		int sum = 0;
		System.out.println();
		try (DataInputStream input = new DataInputStream(new FileInputStream(path))) {
			while (true) {
				sum += input.readInt();
			}
		} catch (EOFException ex) {
			System.out.println("Sum is " + sum);
		}
	}
}
