package xchess.tests;

import java.util.ArrayList;
import xchess.*;

public class TestRook {
	public static void main(String[] args) {
		Game.cb.getState();
		Game.cb.set(new Point(3, 4), 4);
		Game.cb.getState();

		ArrayList<Point> m = Rook.getPossibleMoves(new Point(3,4));
		for(int i=0; i<m.size(); i++)
			System.out.println((m.get(i)));
	}
}
