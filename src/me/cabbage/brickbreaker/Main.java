package me.cabbage.brickbreaker;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static final double WINDOW_WIDTH = 600;
    public static final double WINDOW_HEIGHT = 800;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage mainStage) throws Exception {
        mainStage.setTitle("Brick Breaker");
        mainStage.setResizable(false);
        mainStage.setWidth(WINDOW_WIDTH);
        mainStage.setHeight(WINDOW_HEIGHT);
        mainStage.show();
    }
}
