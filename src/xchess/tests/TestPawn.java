package xchess.tests;

import java.util.ArrayList;

import xchess.*;

public class TestPawn {
	public static void main(String[] args) {
		Game.cb.getState();
		Game.cb.set(new Point(0,5), 1);
		Game.cb.set(new Point(7,5), 1);
		System.out.println();
		Game.cb.getState();
		
		ArrayList<Point> m = Pawn.getPossibleMoves(new Point(0,5));
		for(int i=0; i<m.size(); i++)
			System.out.println((m.get(i)));
		
		m = Pawn.getPossibleMoves(new Point(7,5));
		for(int i=0; i<m.size(); i++)
			System.out.println((m.get(i)));
	}
}
