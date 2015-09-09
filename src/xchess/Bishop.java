package xchess;

import java.util.ArrayList;

public class Bishop extends Piece {
	public static ArrayList<Point> getPossibleMoves(Point current)
	{
		ArrayList<Point> moves= new ArrayList<Point>();
		int x=current.getX(),y=current.getY();

		System.out.println( "Accessing piece at location (" + x + "," + y + ")" );
		int sign = (int)Math.signum(Game.cb.getElement(x,y));

		for(int i=x+1;i<8;i++)
		{
			
			for(int j=y+1;j<8;j++)
			{
				if((int)Math.signum(Game.cb.getElement(i,j))!=sign)
					moves.add(new Point(i,j));
				if(Game.cb.getElement(i,j)!=0)
					break;
			}
			
			for(int j=y-1;j>=0;j--)
			{
				if((int)Math.signum(Game.cb.getElement(i,j))!=sign)
					moves.add(new Point(i,j));
				if(Game.cb.getElement(i,j)!=0)
					break;
			}
		}
		for(int i=x-1;i>=0;i--)
		{

			for(int j=y+1;j<8;j++)
			{
				if((int)Math.signum(Game.cb.getElement(i,j))!=sign)
					moves.add(new Point(i,j));
				if(Game.cb.getElement(i,j)!=0)
					break;
			}
			
			for(int j=y-1;j>=0;j--)
			{
				if((int)Math.signum(Game.cb.getElement(i,j))!=sign)
					moves.add(new Point(i,j));
				if(Game.cb.getElement(i,j)!=0)
					break;
			}
		}
		return moves;
	}
}
