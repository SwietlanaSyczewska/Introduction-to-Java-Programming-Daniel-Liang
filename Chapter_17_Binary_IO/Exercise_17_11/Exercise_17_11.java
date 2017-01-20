package Exercise_17_11;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise_17_11 extends Application {
	protected SplitFilePane pane = new SplitFilePane();
	String path = null;
	int numberOfPieces = 1;
	

	public void start(Stage primaryStage) throws Exception {
		pane.tfFileName.setOnAction(e -> getPath());
		pane.tfNumberOfPieces.setOnAction(e -> getNumber());
		pane.btStart.setOnAction(e -> divide());
		Scene scene = new Scene(pane, 360, 130);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void divide() {
		RandomAccessFile[] splits = new RandomAccessFile[numberOfPieces];
		try (RandomAccessFile inout = new RandomAccessFile(path, "r");) {
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
		} catch (FileNotFoundException ex) {
		} catch (IOException ex) {
		} catch (IndexOutOfBoundsException ex) {
		}

	}

	private void getNumber() {
		numberOfPieces = Integer.parseInt(pane.tfNumberOfPieces.getText());

	}

	private void getPath() {
		path = pane.tfFileName.getText();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
