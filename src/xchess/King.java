package xchess;

import java.util.*;

public class King {
	public Vector getPossibleMoves(Point current) {
		// How to make current immutable??
		// const doesn't work in java.

		Vector<Point> moves = new Vector<Point>(10);
		int x = current.x;
		int y = current.y;
		int myCol = Math.abs(cb.getElement(current));
		int i=0, j=0;
		for(i=current.x-1; i<=current.x+1; i++)
			for(j=current.y-1; j<=current.y+1; j++) {
				if(i!=x && j!=y && i>=0 && j>=0) {
					int otherCol = Math.abs(cb.getElement(Point(i, j)));
					if(otherCol != myCol)
						moves.push
					
				}
			}
		 
	}	

}
