
package Katsetamine;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// NUPUD ON MÖÖDA EKRAANI JAGATUD JA IGA NUPU VAJUTUS KUVAB KONSOOLIS SELLE NUPU TEKSTI

public class AkenMisTeebImesid extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        RadioButton rd1 = new RadioButton();
        btn.setText("Say 'Hello World'");
        rd1.setText("Say 'coca cola''");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        rd1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Coca cola");
            }
        });


        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(rd1);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
