package EksamiKordamine;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class javaFx extends Application {
    Stage primaryStage = new Stage();
    Hobune k = new Hobune();



    @Override
    public void start(Stage primaryStage) throws Exception {
        kana();


    }

    public void kana() {

        VBox ui =new VBox();
        Scene scene = new Scene(ui, 300, 400);
        primaryStage.setScene(scene);

        Label kiri = new Label(k.nimi);
        ui.getChildren().add(kiri);

        Button nupp = new Button("vajuta mind");
        ui.getChildren().add(nupp);
        nupp.setOnAction((event) -> {
            muna();
        });
        primaryStage.show();

    };

    public void muna() {

        Pane pane2 =new Pane();
        Scene scene2 = new Scene(pane2, 300, 400);
        primaryStage.setScene(scene2);


        String hobuseNumber = Integer.toString(k.ytleOmanimi());

        Label kiri2 = new Label(hobuseNumber);
        pane2.getChildren().add(kiri2);
        primaryStage.show();



    };


}
