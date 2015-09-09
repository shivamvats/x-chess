package xchess;

import java.util.*;

public class Knight extends Piece {
	public ArrayList<Point> getPossibleMoves(Point current) {
		ArrayList<Point> moves = new ArrayList<>(10);
		
		int x = current.getX();
		int y = current.getY();
		int myColor = (int)Math.signum(Game.cb.getElement(x, y));
		
		for(int i=1; i<3; i++) {
			int j = 3-i;
			int otherColor = (int)Math.signum(Game.cb.getElement(i, j));
			if(otherColor != myColor)
				moves.add(new Point(i, j));
			
			otherColor = (int)Math.signum(Game.cb.getElement(-i, j));
			if(otherColor != myColor)
				moves.add(new Point(i, j));
				
			otherColor = (int)Math.signum(Game.cb.getElement(i, -j));
			if(otherColor != myColor)
				moves.add(new Point(i, j));
			
			otherColor = (int)Math.signum(Game.cb.getElement(-i, -j));
			if(otherColor != myColor)
				moves.add(new Point(i, j));
			
		}
		
		return moves;
	}
}
