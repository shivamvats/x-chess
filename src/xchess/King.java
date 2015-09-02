package xchess;

import java.util.*;

public class King {
	public ArrayList<Point> getPossibleMoves(Point current) {
		// How to make current immutable??
		// const doesn't work in java.
		 
		// Add option to have variable row and cols.
		ArrayList<Point> moves = new ArrayList<>(10);
		int x = current.getX();
		int y = current.getY();
		int myColor = (int)Math.signum(Game.cb.getElement(x, y));
		
		for(int i=x-1; i<=x+1; i++)
			for(int j=y-1; j<=y+1; j++) {
				if(!(i==x && j==y) && i>=0 && j>=0 && i<8 && j<8) {
					int otherColor = (int)Math.signum(Game.cb.getElement(i, j));
					if(otherColor != myColor)
						moves.add(new Point(i, j));	
				}
			}
		return moves;
	}	

}
