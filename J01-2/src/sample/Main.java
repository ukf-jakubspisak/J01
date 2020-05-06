package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){

        Group root = new Group();
        Scene scene = new Scene(root, 640, 480);
        primaryStage.setTitle("TXT TO COLOR");
        scene.setFill(Color.rgb(128, 168, 20));

        TextField vstup = new TextField();
        vstup.setTranslateX(20);
        vstup.setTranslateY(20);

        Button ok = new Button("DO ET");
        ok.setTranslateX(180);
        ok.setTranslateY(20);


        root.getChildren().addAll(vstup, ok);
        primaryStage.setScene(scene);
        primaryStage.show();

        ok.setOnAction(click -> {
            int[] farba = new int[3];

            String text = vstup.getText();

            for (int i = 0; i < text.length(); i++) {
                switch (text.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'y':
                        farba[0] += 16;
                        break;

                    case 'd':
                    case 't':
                    case 'n':
                    case 'l':
                    case 'g':
                    case 'k':
                    case 'h':
                    case 'c':
                    case 'j':
                    case 'b':
                    case 'm':
                    case 'p':
                    case 'r':
                    case 's':
                    case 'v':
                    case 'z':
                    case 'f':
                        farba[1] += 24;
                        break;
                }
            }

            farba[2] = (text.length() % 25) * 10;

            for (int i = 0; i < 2; i++) {
                if (farba[i] > 255) farba[i] = 255;
            }

            scene.setFill(Color.rgb(farba[0], farba[1], farba[2]));
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}