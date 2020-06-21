package me.cabbage.brickbreaker.game;

import me.cabbage.brickbreaker.Main;

public class Player {

    private String name;
    private double score;
    private double xPos, yPos;

    public Player(String name) {
        this.name = name;
        init();
    }

    private void setxPos(double x) {
        this.xPos = x;
    }

    private void setyPos(double y) {
        this.yPos = y;
    }

    private void init() {
        score = 0.0;
        setxPos(Main.WINDOW_WIDTH / 2);
        setyPos(10);
    }
}
