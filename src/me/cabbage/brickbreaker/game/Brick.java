package me.cabbage.brickbreaker.game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Brick {

    private double oldXPos, oldYPos;
    private double xPos, yPos;
    private Color color;
    private int hits;
    private boolean visible;


    public Brick(double xPos, double yPos, Color c) {
        setxPos(xPos);
        setyPos(yPos);
        setColor(c);
    }

    private void setxPos(double newX) {
        this.oldX = xPos;
        this.yPos = newX;
    }

    private void setyPos(double newY) {
        this.oldY = yPos;
        this.yPos = newY;
    }

    private void setColor(Color color) {
        this.color = color;
    }

    public void draw(GraphicsContext ctx) {
        ctx.setFill(color);
        ctx.moveTo(xPos, yPos);
        ctx.fillRect();
    }

    public void update() {

    }
}
