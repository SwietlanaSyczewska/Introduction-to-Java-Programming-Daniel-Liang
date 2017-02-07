package Exercise_17_08;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise_17_08 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		int count;
		try (RandomAccessFile inout = new RandomAccessFile(
				"src/Exercise_17_08.dat", "rw")) {

			if (inout.length() == 0) {
				count = 0;
				System.out.println(count);
				inout.writeInt(1);
			} else {
				count = inout.readInt();
				System.out.println(count);
				inout.seek(0);
				inout.writeInt(++count);

			}
			
		}
	}
}
