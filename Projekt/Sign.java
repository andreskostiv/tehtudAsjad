package Projekt;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

/**
 * Created by maus on 3.12.2015.
 */
public class Sign {
    public ImageView sign;
    public VBox answers;
    public Label text;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb4;
    RadioButton rb3;
    ToggleGroup radiobuttons;
    Integer rnd;



    public Label newQuestion() {
        ArrayList<String> labels = new ArrayList<String>();
        text = new Label();
        labels.add("Millise meremärgiga on tegemist?");
        labels.add("Mis meremärk on kujutatud alloleval pildil?");
        labels.add("Mis meremärk on pildil?");
        labels.add("Mis meremärk on alloleval pildil?");

        int rnd = (int) (Math.random() * (labels.size()));
        text.setText(labels.get(rnd));
        text.getStyleClass().add("kokkuvote");
        return text;
    }

    public ImageView generateSign() {
        rnd = (int) (Math.random() * 13);
        Image picture = new Image("Res/Cardinal" + rnd + ".png");
        sign = new ImageView(picture);
        sign.setFitHeight(200);
        sign.setPreserveRatio(true);
        return sign;
    }

    public VBox answers() {
        answers = new VBox();
        answers.getStyleClass().add("vastused");

        ArrayList<String> a = new ArrayList<>();

        a.add("Laevatee teljepoi. Ohutu vee märk (safe water)");
        a.add("Idatooder");
        a.add("Idapoi");
        a.add("Lõunatooder");
        a.add("Lõunapoi");
        a.add("Läänetooder");
        a.add("Läänepoi");
        a.add("Põhjatooder");
        a.add("Põhjapoi");
        a.add("Eriotstarbeline märk, mis viitab eripiirkonnale või objektile.");
        a.add("Eraldiseisva ohu märk. Märgistab väikesemõõtmelist ohtu (< 1 kbt)");
        a.add("Laevatee parema külje märk");
        a.add("Laevatee vasaku külje märk");

        rb1 = new RadioButton(a.get(rnd));
        a.remove(rb1.getText());
        rb2 = new RadioButton(a.get((int) (Math.random() * (a.size()))));
        a.remove(rb2.getText());
        rb3 = new RadioButton(a.get((int) (Math.random() * (a.size()))));
        a.remove(rb3.getText());
        rb4 = new RadioButton(a.get((int) (Math.random() * (a.size()))));
        a.remove(rb4.getText());

        radiobuttons = new ToggleGroup();
        rb1.setToggleGroup(radiobuttons);
        rb2.setToggleGroup(radiobuttons);
        rb3.setToggleGroup(radiobuttons);
        rb4.setToggleGroup(radiobuttons);

        ArrayList<RadioButton> list = new ArrayList<>();
        list.add(rb1);
        list.add(rb2);
        list.add(rb3);
        list.add(rb4);

        for (int i = 0; i < 4; i++) {
            int rnd = (int) (Math.random() * list.size());
            answers.getChildren().add(list.get(rnd));
            list.remove(rnd);
        }
        return answers;
    }
}

