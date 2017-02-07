package Exercise_17_04;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise_17_04 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String welcomeJava = "src/Welcome.java";
		String welcomeUTF = "src/Welcome.UTF";

		File file = new File(welcomeJava);
		try (BufferedReader in = new BufferedReader(new FileReader(file));
				DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(new FileOutputStream(welcomeUTF)))) {
			String s;
			int fileSize = 0;
			while ((s = in.readLine()) != null) {
				s += "\n";
				out.writeUTF(s);
				fileSize += s.length();
			}
			System.out.println(welcomeJava + " = " + fileSize + " bytes");
			System.out.println(welcomeUTF + " = " + out.size() + " bytes");
		}

	}

}


