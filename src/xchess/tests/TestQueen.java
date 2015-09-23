package xchess.tests;

import java.util.ArrayList;
import xchess.*;

public class TestQueen {
	public static void main(String[] args) {
		Game.cb.getState();
		Game.cb.set(new Point(3,4), 5);
		System.out.println();
		Game.cb.getState();
		
		ArrayList<Point> m = Queen.getPossibleMoves(new Point(3,4));
		for(int i=0; i<m.size(); i++)
			System.out.println((m.get(i)));
	}
}
