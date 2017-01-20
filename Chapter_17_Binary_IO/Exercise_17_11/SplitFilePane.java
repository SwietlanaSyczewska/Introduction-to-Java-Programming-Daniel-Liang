package Exercise_17_11;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;

public class SplitFilePane extends BorderPane {
	protected Label lbText = new Label();
	protected TextField tfFileName = new TextField();
	protected TextField tfNumberOfPieces = new TextField();
	protected Button btStart = new Button("Start");
	protected FlowPane paneInfo = new FlowPane();
	protected HBox startPane = new HBox();
	protected HBox textPane = new HBox();

	public SplitFilePane() {
		drawSplitFilePane();
	}

	public void drawSplitFilePane() {
		textPane.getChildren().add(lbText);
		textPane.setAlignment(Pos.CENTER);
		lbText.setText("If you split a file named temp.txt into 3 smaller files,\n"
				+ "the three smaller files are temp.txt.1, temp.txt.2, and temp.txt.3.");
		paneInfo.setPadding(new Insets(10, 10, 0, 10));
		paneInfo.getChildren().addAll(new Label("Enter a file:                                        "), tfFileName,
				new Label("Specify the number of smaller files: "), tfNumberOfPieces);
		startPane.getChildren().add(btStart);
		startPane.setAlignment(Pos.CENTER);
		setTop(textPane);
		setCenter(paneInfo);
		setBottom(startPane);

	}

}
