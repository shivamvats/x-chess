package xchess.tests;

import java.util.ArrayList;

import xchess.*;

public class TestKnight {
	public static void main(String[] args) {
		ChessBoard cb = new ChessBoard();
		
		cb.getState();
		
		ArrayList<Point> m=new ArrayList<Point>();
		Knight r = new Knight();
		m = r.getPossibleMoves(new Point(1, 0));
		for(int i=0;i<m.size();i++)
		{
			System.out.println((m.get(i)));
		}
		
	}
}
