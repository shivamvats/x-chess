package xchess;

import java.util.ArrayList;

public class Pawn extends Piece {

	public static ArrayList<Point> getPossibleMoves(Point current) {
		ArrayList<Point> moves = new ArrayList<Point>();
		int x=current.getX(), y=current.getY();
		
		int sign = (int)Math.signum(Game.cb.getElement(x, y));

		if(Game.cb.getElement(x,  y+sign) == 0) {
			moves.add(new Point(x, y+sign));
			//Check for two steps
			if(y == (sign*8)%7)
				if(Game.cb.getElement(x, y+2*sign) == 0)
					moves.add(new Point(x, y+2*sign));
		}
		//Check diagonal move
		if( x < 7 && Math.signum(Game.cb.getElement(x+1,  y+sign)) != sign)
			moves.add(new Point(x+1, y+sign));
		if( x > 0 && (Game.cb.getElement(x-1, y+sign)) != sign)
			moves.add(new Point(x-1, y+sign));
		return moves;
	}
}
