package Katsetamine;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



/**
 * Loo Label, mille sisu saab kasutaja TextFieldi kaudu muuta.
 */
public class JavaFX extends Application {

    @Override
    public void start (Stage primaryStage ) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 150, 150 );
        primaryStage.setScene(scene);

        TextField sisesta = new TextField();
        stack.getChildren().add(sisesta);

        primaryStage.show();

    }



}
