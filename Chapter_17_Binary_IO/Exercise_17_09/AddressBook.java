package Exercise_17_09;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;

public class AddressBook extends BorderPane {
	protected TextField tfName = new TextField();
	protected TextField tfStreet = new TextField();
	protected TextField tfCity = new TextField();
	protected TextField tfState = new TextField();
	protected TextField tfZip = new TextField();
	protected Button btAdd = new Button("Add");
	protected Button btFirst = new Button("First");
	protected Button btNext = new Button("Next");
	protected Button btPrevious = new Button("Previous");
	protected Button btLast = new Button("Last");
	protected Button btUpdate = new Button("Update");
	private FlowPane paneForInfo = new FlowPane(5, 5);
	private HBox paneForButtons = new HBox(5);

	public AddressBook() {
		drawAddressBook();
	}

	private void drawAddressBook() {
		tfName.setPrefColumnCount(23);
		tfStreet.setPrefColumnCount(23);
		tfCity.setPrefColumnCount(8);
		tfState.setPrefColumnCount(2);
		tfZip.setPrefColumnCount(4);

		paneForInfo.setPadding(new Insets(10, 10, 0, 10));
		
		paneForInfo.getChildren().addAll(new Label("Name"), tfName, new Label("Steet"), tfStreet,
				new Label("City   "), tfCity, new Label("State"), tfState, new Label("Zip"), tfZip);
		paneForButtons.getChildren().addAll(btAdd, btFirst, btNext, btPrevious, btLast, btUpdate);
		paneForButtons.setAlignment(Pos.CENTER);

		setCenter(paneForInfo);
		setBottom(paneForButtons);

	}
}
