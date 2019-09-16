package com.krld.hellofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFx extends Application {

	/**
	 * do not set this class as main class https://stackoverflow.com/a/52571719/1680426
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Hello World!");
		Button btn = new Button();
		btn.setText("Say 'Hello World'");
		btn.setOnAction(event -> {
			Alert alert = new Alert(Alert.AlertType.INFORMATION, "Hello World", ButtonType.OK);
			alert.show();
		});

		StackPane root = new StackPane();
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}
}
