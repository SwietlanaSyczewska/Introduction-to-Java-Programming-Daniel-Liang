package Exercise_17_13;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;

public class CombineFilePane extends BorderPane {
	protected TextField tfSourceFile = new TextField();
	protected TextField tfTargetFile = new TextField();

	protected Button btCombine = new Button("Combine");
	protected FlowPane paneInfo = new FlowPane();
	protected HBox buttonPane = new HBox();

	CombineFilePane() {
		createCombineFilePane();

	}

	private void createCombineFilePane() {
		tfSourceFile.setPrefColumnCount(140
				);
		tfTargetFile.setPrefColumnCount(70);
		paneInfo.getChildren().addAll(new Label("Source file: "), tfSourceFile, new Label("Target file:  "),
				tfTargetFile);
		buttonPane.getChildren().add(btCombine);
		buttonPane.setAlignment(Pos.CENTER);
		setTop(paneInfo);
		setBottom(buttonPane);
	}

}
