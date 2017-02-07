package Exercise_17_12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise_17_12 {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		String[] paths = getPaths("C:\\Users\\swiet\\workspace\\Introduction to Java Programming Daniel Liang\\src\\Exercise_17_06.dat.1",
				"C:\\Users\\swiet\\workspace\\Introduction to Java Programming Daniel Liang\\src\\Exercise_17_06.dat.2",
				"C:\\Users\\swiet\\workspace\\Introduction to Java Programming Daniel Liang\\src\\Exercise_17_06.dat.3",
				"C:\\Users\\swiet\\workspace\\Introduction to Java Programming Daniel Liang\\src\\Exercise_17_06.dat.4",
				"C:\\Users\\swiet\\workspace\\Introduction to Java Programming Daniel Liang\\src\\Exercise_17_06.dat.5");

		String path = "C:\\Users\\swiet\\workspace\\Introduction to Java Programming Daniel Liang\\src\\combinedFile.dat";
		RandomAccessFile[] source = new RandomAccessFile[paths.length];
		try (RandomAccessFile target = new RandomAccessFile(path, "rw");) {
			for (int i = 0; i < paths.length; i++) {
				source[i] = new RandomAccessFile(paths[i], "r");
			}
			for (int i = 0; i < source.length; i++) {
				byte b[] = new byte[(int) source[i].length()];
				source[i].seek(0);
				source[i].read(b);
				target.seek(target.length());
				target.write(b);
			}
		}
	}

	public static String[] getPaths(String... paths) {
		String arr[] = new String[paths.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = paths[i];
		}
		return arr;
	}
}
