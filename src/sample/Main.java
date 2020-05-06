package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root, 720.0D, 406.0D);
        scene.setFill(Color.BLACK);
        primaryStage.setTitle("W");
        GaussianBlur blur1 = new GaussianBlur();
        int glowsize = 10;
        Polyline yrden = new Polyline(new double[]{130.0D, 191.0D, 143.0D, 174.0D, 103.0D, 174.0D, 143.0D, 223.0D, 103.0D, 223.0D, 112.0D, 210.0D});
        yrden.setFill(Color.TRANSPARENT);
        yrden.setStroke(Color.rgb(135, 68, 171));
        yrden.setStrokeWidth((double)glowsize);
        yrden.setEffect(blur1);
        Polyline yrdenglow = new Polyline(new double[]{130.0D, 191.0D, 143.0D, 174.0D, 103.0D, 174.0D, 143.0D, 223.0D, 103.0D, 223.0D, 112.0D, 209.0D});
        yrdenglow.setFill(Color.TRANSPARENT);
        yrdenglow.setStroke(Color.WHITE);
        yrdenglow.setStrokeWidth(3.0D);
        Polyline quen = new Polyline(new double[]{245.0D, 190.0D, 262.0D, 190.0D, 270.0D, 174.0D, 218.0D, 174.0D, 244.0D, 223.0D, 252.0D, 209.0D});
        quen.setFill(Color.TRANSPARENT);
        quen.setStroke(Color.rgb(223, 226, 61));
        quen.setStrokeWidth((double)glowsize);
        quen.setEffect(blur1);
        Polyline quenglow = new Polyline(new double[]{245.0D, 190.0D, 262.0D, 190.0D, 270.0D, 174.0D, 218.0D, 174.0D, 244.0D, 223.0D, 252.0D, 209.0D});
        quenglow.setFill(Color.TRANSPARENT);
        quenglow.setStroke(Color.WHITE);
        quenglow.setStrokeWidth(3.0D);
        Polyline igni = new Polyline(new double[]{366.0D, 174.0D, 339.0D, 224.0D, 391.0D, 224.0D, 375.0D, 194.0D});
        igni.setFill(Color.TRANSPARENT);
        igni.setStroke(Color.rgb(223, 20, 39));
        igni.setStrokeWidth((double)glowsize);
        igni.setEffect(blur1);
        Polyline igniglow = new Polyline(new double[]{366.0D, 174.0D, 339.0D, 224.0D, 391.0D, 224.0D, 375.0D, 194.0D});
        igniglow.setFill(Color.TRANSPARENT);
        igniglow.setStroke(Color.WHITE);
        igniglow.setStrokeWidth(3.0D);
        Polyline axii = new Polyline(new double[]{513.0D, 174.0D, 459.0D, 174.0D, 487.0D, 223.0D, 505.0D, 191.0D});
        axii.setFill(Color.TRANSPARENT);
        axii.setStroke(Color.rgb(0, 208, 0));
        axii.setStrokeWidth((double)glowsize);
        axii.setEffect(blur1);
        Polyline axiiglow = new Polyline(new double[]{513.0D, 174.0D, 459.0D, 174.0D, 487.0D, 223.0D, 505.0D, 191.0D});
        axiiglow.setFill(Color.TRANSPARENT);
        axiiglow.setStroke(Color.WHITE);
        axiiglow.setStrokeWidth(3.0D);
        Polyline aard = new Polyline(new double[]{598.0D, 189.0D, 608.0D, 174.0D, 635.0D, 223.0D, 580.0D, 224.0D, 591.0D, 206.0D, 607.0D, 206.0D});
        aard.setFill(Color.TRANSPARENT);
        aard.setStroke(Color.rgb(40, 255, 213));
        aard.setStrokeWidth((double)glowsize);
        aard.setEffect(blur1);
        Polyline aardglow = new Polyline(new double[]{598.0D, 189.0D, 608.0D, 174.0D, 635.0D, 223.0D, 580.0D, 224.0D, 591.0D, 206.0D, 607.0D, 206.0D});
        aardglow.setFill(Color.TRANSPARENT);
        aardglow.setStroke(Color.WHITE);
        aardglow.setStrokeWidth(3.0D);
        root.getChildren().addAll(new Node[]{yrden, yrdenglow, quen, quenglow, igni, igniglow, axii, axiiglow, aard, aardglow});
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
