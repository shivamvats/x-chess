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
			int otherColor = (int)Math.signum(Game.cb.getElement(x+i, y+j));
			if((otherColor != myColor) && isValid(x+i, y+j))
				moves.add(new Point(x+i, y+j));
			
			otherColor = (int)Math.signum(Game.cb.getElement(x-i, y+j));
			if((otherColor != myColor) && isValid(x-i, y+j))
				moves.add(new Point(x-i, y+j));
				
			otherColor = (int)Math.signum(Game.cb.getElement(x+i, y-j));
			if((otherColor != myColor) && isValid(x+i, y-j)) 
				moves.add(new Point(x+i, y-j));
			
			otherColor = (int)Math.signum(Game.cb.getElement(x-i, y-j));
			if((otherColor != myColor) && isValid(x-i, y-j))
				moves.add(new Point(x-i, y-j));
			
		}
		
		return moves;
	}
	
	private Boolean isValid(int x, int y) {
		
		if((x >= 0 && x < 8) && (y >= 0 && y <8))
			return true;
		else 
			return false;
	}
}
