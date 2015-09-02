package xchess.tests;

import java.util.ArrayList;

import xchess.*;

public class TestKing {
	public static void main(String[] args) {
		ChessBoard cb = new ChessBoard();
		cb.set(new Point(3, 4), 4);
		cb.getState();
		
		ArrayList<Point> m=new ArrayList<Point>();
		King r = new King();
		m = r.getPossibleMoves(new Point(3,4));
		for(int i=0;i<m.size();i++)
		{
			System.out.println((m.get(i)));
		}
		
	}
}
