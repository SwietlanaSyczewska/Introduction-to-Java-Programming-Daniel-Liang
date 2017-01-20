package Exercise_17_13;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Exercise_17_13 extends Application {
	CombineFilePane pane = new CombineFilePane();
	String[] sourceFilePaths;
	String targetFilePath;

	public void start(Stage primaryStage) {
		pane.btCombine.setOnAction(e -> combine());
		pane.tfSourceFile.setOnAction(e -> getSourceFiles());
		pane.tfTargetFile.setOnAction(e -> getTargetFile());
		Scene scene = new Scene(pane, 1590, 130);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void getSourceFiles() {
		String sourcePathtoDivide = pane.tfSourceFile.getText();
		sourceFilePaths = sourcePathtoDivide.split(",");

	}

	private void getTargetFile() {
		targetFilePath = pane.tfTargetFile.getText();
	}

	 
	private void combine() {

		RandomAccessFile[] source = new RandomAccessFile[sourceFilePaths.length];
		try (RandomAccessFile target = new RandomAccessFile(targetFilePath, "rw")) {
			for (int i = 0; i < sourceFilePaths.length; i++) {
				source[i] = new RandomAccessFile(sourceFilePaths[i], "r");
			}
			for (int i = 0; i < source.length; i++) {
				byte b[] = new byte[(int) source[i].length()];
				source[i].seek(0);
				source[i].read(b);
				target.seek(target.length());
				target.write(b);
			}
		} catch (Exception e) {
			System.out.println("Wrong input");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
