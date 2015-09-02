package xchess;
import java.util.*;

public class Rook extends Piece {

	public ArrayList<Point> getPossibleMoves(Point p)
	{
		ArrayList<Point> moves= new ArrayList<Point>();
		int x=p.getX(),y=p.getY();

		System.out.println( "Accessing piece at location (" + x + "," + y + ")" );	
		int sign = (int)Math.signum(Game.cb.getElement(x,y));

		/* 
		 * 	Checking all possible moves on the right hand side of the rook.
		 */
		for(int i=x+1;i<8;i++)
		{
			if((int)Math.signum(Game.cb.getElement(i,y))!=sign)
			{
				moves.add(new Point(i,y));
			}
		}
		/*
		 * 	Checking all possible moves on the left hand side of the rook.
		 */
		for(int i=x-1;i>-1;i--)
		{
			if((int)Math.signum(Game.cb.getElement(i,y))!=sign)
			{
				moves.add(new Point(i,y));
			}
		}
		/*
		 * 	Checking all possible moves above the rook.
		 */
		for(int i=y+1;i<8;i++)
		{
			if((int)Math.signum(Game.cb.getElement(x,i))!=sign)
			{
				moves.add(new Point(x,i));
			}
		}
		/*
		 * 	Checking all possible moves below the rook.
		 */
		for(int i=y-1;i>-1;i--)
		{
			 if((int)Math.signum(Game.cb.getElement(x,i))!=sign)
			{
				moves.add(new Point(x,i));
			}
		}
		return moves;
		
	}

}
