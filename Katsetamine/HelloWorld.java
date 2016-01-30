package Katsetamine;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class HelloWorld extends Application {
    
    @Override
    public void start(Stage Stage) throws Exception {
        Aken1();
    }




    public void Aken1(){
        Stage Stage = new Stage();
        Stage.setTitle("Algus");
        Button btn = new Button();
        btn.setText("Liigume edasi'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                Aken2();
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Stage.setScene(new Scene(root, 300, 250));
        Stage.show();
    }

    private void Aken2(){
        Stage Stage = new Stage();
        Stage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Stage.setScene(new Scene(root, 300, 250));
        Stage.show();
    }
}