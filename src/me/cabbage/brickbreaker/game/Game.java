package me.cabbage.brickbreaker.game;

public class Game {

    public final static double PLAYER_START_X;
    public final static double PLAYER_START_Y;

    private Player player1;

    public Game() {
        // set player x and y to center of window

        init();
    }

    private void init() {
        player1 = new Player("Player1");

    }
}
