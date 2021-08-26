package com.OPPs2.level2.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		GamingConsole[] games = { new MarioGame(), new ChessGame() };
		for (GamingConsole game : games) {
		// MarioGame game = new MarioGame();
		// Chess game = new ChessGame();
		// GamingConsole game = new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
}