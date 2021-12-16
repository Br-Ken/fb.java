package com.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    public static boolean GAME_SET;
    public void startGame() {
        if (!GAME_SET) {
            GAME_SET = true;
            FlappyBird game = new FlappyBird();
            Stage st = new Stage();
            try {
                game.start(st);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }
    @FXML
    private Label welcomeText;


}