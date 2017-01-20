package Exercise_17_02;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_17_02 {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\swiet\\Desktop\\Intro to Java Programming\\Exercise_17_02.dat";
		File file = new File(path);

		try (DataOutputStream output = new DataOutputStream(new FileOutputStream(path))) {
			for (int i = 0; i < 10; i++) {
				output.writeInt((int) (Math.random() * 100));
			}
		}

	}

}
