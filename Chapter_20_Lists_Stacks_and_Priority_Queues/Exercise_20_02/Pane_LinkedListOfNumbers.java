package Exercise_20_02;

import java.util.LinkedList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Pane_LinkedListOfNumbers extends BorderPane {
	protected Button btSort;
	protected Button btShuffle;
	protected Button btReverse;
	protected Label lbEnterANumber;
	protected Label lbWrongNumber;
	protected TextField tfEnterANumber;
	protected TextArea textArea;
	protected LinkedList<Integer> list;

	Pane_LinkedListOfNumbers() {

		lbEnterANumber = new Label("Enter a number");
		tfEnterANumber = new TextField();
		tfEnterANumber.setPrefColumnCount(5);
		lbWrongNumber = new Label();
		lbWrongNumber.setVisible(false);

		HBox hbNumberInput = new HBox(10, lbEnterANumber, tfEnterANumber, lbWrongNumber);
		hbNumberInput.setAlignment(Pos.CENTER);
		hbNumberInput.setPadding(new Insets(5));
		setTop(hbNumberInput);

		list = new LinkedList();

		textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setWrapText(true);
		ScrollPane scrollpane = new ScrollPane(textArea);
		setCenter(scrollpane);

		btSort = new Button("Sort");
		btShuffle = new Button("Shuffle");
		btReverse = new Button("Reverse");
		HBox hbButtons = new HBox(10, btSort, btShuffle, btReverse);
		hbButtons.setAlignment(Pos.BASELINE_CENTER);
		hbButtons.setPadding(new Insets(5));
		setBottom(hbButtons);
	}

}
