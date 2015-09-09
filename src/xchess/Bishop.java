package xchess;

import java.util.ArrayList;

public class Bishop extends Piece {
	public static ArrayList<Point> getPossibleMoves(Point current)
	{
		ArrayList<Point> moves= new ArrayList<Point>();
		int x=current.getX(),y=current.getY();

		System.out.println( "Accessing piece at location (" + x + "," + y + ")" );
		int sign = (int)Math.signum(Game.cb.getElement(x,y));

		for(int i=x+1,j=y+1;i<8 && j<8;i++,j++)
		{
			if((int)Math.signum(Game.cb.getElement(i,j))!=sign)
				moves.add(new Point(i,j));
			if(Game.cb.getElement(i,j)!=0)
				break;
		}
		
		for(int i=x+1,j=y-1; i<8 && j>=0; i++,j--)
		{
				if((int)Math.signum(Game.cb.getElement(i,j))!=sign)
					moves.add(new Point(i,j));
				if(Game.cb.getElement(i,j)!=0)
					break;
		}
		
		for(int i=x-1,j=y+1;i>=0 && j<8;i--,j++)
		{
				if((int)Math.signum(Game.cb.getElement(i,j))!=sign)
					moves.add(new Point(i,j));
				if(Game.cb.getElement(i,j)!=0)
					break;
		}	
		for(int i=x-1,j=y-1;i>=0 && j>=0;i--,j--)
		{
			if((int)Math.signum(Game.cb.getElement(i,j))!=sign)
					moves.add(new Point(i,j));
				if(Game.cb.getElement(i,j)!=0)
					break;
		}
		return moves;
	}
}
