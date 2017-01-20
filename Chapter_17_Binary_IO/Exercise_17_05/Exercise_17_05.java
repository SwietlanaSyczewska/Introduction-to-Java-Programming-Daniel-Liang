package Exercise_17_05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exercise_17_05 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		int[] numbers = { 1, 2, 3, 4, 5 };
		try (ObjectOutputStream output = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\swiet\\Desktop\\Intro to Java Programming\\Exercise_17_05.dat"));) {
			output.writeObject(numbers);
			output.writeDouble(5.5);
			output.writeObject(new java.util.Date());
		}
	}
}
