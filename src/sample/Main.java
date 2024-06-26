package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.geometry.Orientation;
import javafx.geometry.Insets;

public class Main extends Application{
    public static void main(String[] args) {

        Application.launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        ToggleButton lightBtn = new ToggleButton("Light");
        Label stateLbl = new Label();
        lightBtn.setOnAction(event -> {

            if (lightBtn.isSelected()) {
                stateLbl.setText("vkl");
            } else {
                stateLbl.setText("Vikl");
            }

            FlowPane root = new FlowPane(10, 10);
            root.getChildren().addAll(lightBtn, stateLbl);
            root.setPadding(new Insets(10));
            Scene scene = new Scene(root, 250, 200);

            stage.setScene(scene);

            stage.setTitle("Svet");

            stage.show();
        });

    }
}