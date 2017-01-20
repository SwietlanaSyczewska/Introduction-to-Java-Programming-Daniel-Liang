package Exercise_17_10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise_17_10 {

	public static void main(String[] args) throws IOException {
		String numberInput = "5";
		String path = "C:\\Users\\swiet\\Desktop\\Intro to Java Programming\\Exercise_17_06.dat";
		int numberOfPieces = Integer.parseInt(numberInput);
		RandomAccessFile[] splits = new RandomAccessFile[numberOfPieces];
		try (RandomAccessFile inout = new RandomAccessFile(path, "r")) {
			for (int i = 0; i < splits.length; i++) {
				splits[i] = new RandomAccessFile(path + "." + (i + 1), "rw");
			}
			int size = Math.round(inout.length() / numberOfPieces);
			int count = 0;
			byte[] b;
			for (int i = 0; i < numberOfPieces - 1; i++) {
				inout.seek(count * size);
				b = new byte[size];
				inout.read(b);
				splits[i].write(b);
				count++;
			}
			inout.seek(count * size);
			b = new byte[(int) inout.length() - (count * size)];
			inout.read(b);
			splits[numberOfPieces - 1].write(b);

		}
	}

}
