/*
Copyright 2010 kiddy
*/
package other;

interface Game { boolean move(); }
interface GameFactory { Game getGame(); }

class Checker implements Game {
	private int moves = 0;
	private static final int MOVES = 3;
	public boolean move() {
		System.out.println("Checker move " + moves);
		return ++moves != MOVES;
	}
}

class CheckerFactory implements GameFactory {
	public Game getGame() { return new Checker(); }
}

class Chess implements Game {
	private int moves = 0;
	private static final int MOVES = 4;
	public boolean move() {
		System.out.println("Chess move" + moves);
		return ++moves != MOVES;
	}
}

class ChessFactory implements GameFactory {
	public Game getGame() { return new Chess(); }
}

public class Games {

	public static void playGame(GameFactory factory) {
		Game s = factory.getGame();
		while(s.move())
			;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playGame(new CheckerFactory());
		playGame(new ChessFactory());
	}

}
