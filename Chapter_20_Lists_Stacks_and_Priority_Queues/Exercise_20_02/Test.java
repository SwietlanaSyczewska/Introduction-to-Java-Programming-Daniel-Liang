package Exercise_20_02;

import java.util.Collections;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Test extends Application {
	Pane_LinkedListOfNumbers pane = new Pane_LinkedListOfNumbers();

	public void start(Stage primaryStage) throws Exception {
		pane.tfEnterANumber.setOnAction(e -> addIntegers());
		pane.btReverse.setOnAction(e -> reverse());
		pane.btShuffle.setOnAction(e -> shuffle());
		pane.btSort.setOnAction(e -> sort());
		Scene scene = new Scene(pane, 400, 150);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Numbers in linked list");
		primaryStage.show();
	}

	private void reverse() {
		Collections.reverse(pane.list);
		display();
	}

	private void shuffle() {
		Collections.shuffle(pane.list);
		display();
	}

	private void sort() {
		Collections.sort(pane.list);
		display();
	}

	private void addIntegers() {

		try {
			if (pane.lbWrongNumber.isVisible()) {
				pane.lbWrongNumber.setVisible(false);
			}
			int number = Integer.parseInt(pane.tfEnterANumber.getText());
			if (!pane.list.contains(number)) {
				pane.list.addLast(number);
			} else {
				pane.lbWrongNumber.setText("It`s a duplicate");
				pane.lbWrongNumber.setVisible(true);
			}

			display();
		} catch (NumberFormatException ex) {
			pane.lbWrongNumber.setText("Not a number");
			pane.lbWrongNumber.setVisible(true);
		}

	}

	private void display() {
		String output = "";
		for (Integer e : pane.list) {
			output += e + "  ";
			pane.textArea.setText(output);
			pane.tfEnterANumber.setText("");
		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
