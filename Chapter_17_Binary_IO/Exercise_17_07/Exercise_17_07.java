package Exercise_17_07;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Exercise_17_06.Loan;

public class Exercise_17_07 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try (ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream("src/Exercise_17_06.dat")))) {
			while (true) {
				Loan loan = (Loan) input.readObject();
				System.out.println(loan);
				System.out.printf("Total payment: $%.2f\n", loan.getTotalPayment());
				System.out.println();
			}
		} catch (EOFException ex) {

		}
	}
}
