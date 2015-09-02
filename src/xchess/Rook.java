package xchess;
import java.util.*;

public class Rook {
	private ArrayList<Point> moves;										//	Vector to store my possible moves

	public ArrayList<Point> getPossibleMoves(Point p)
	{
		moves= new ArrayList<Point>();
		int x=p.getX(),y=p.getY();
		System.out.println( "Accessing piece at location (" + x + "," + y + ")" );	
		int ele=Game.cb.getElement(x,y);								//	Accessing info about the the element we want to move
		int sign;
		if(ele!=0)
			sign=ele/Math.abs(ele);										//	Extracting its sign
		else sign=1;
		/* 
		 * 	Checking all possible moves on the right hand side of the rook.
		 */
		for(int i=x+1;i<8;i++)
		{
			int current=Game.cb.getElement(i,y);
			if(current==0)
			{
				moves.add(new Point(i,y));
			}
			else if(current/Math.abs(current)!=sign)
			{
				moves.add(new Point(i,y));
			}
		}
		/*
		 * 	Checking all possible moves on the left hand side of the rook.
		 */
		for(int i=x-1;i>-1;i--)
		{
			int current=Game.cb.getElement(i,y);
			if(current==0)
			{
				moves.add(new Point(i,y));
			}
			else if(current/Math.abs(current)!=sign)
			{
				moves.add(new Point(i,y));
			}
		}
		/*
		 * 	Checking all possible moves above the rook.
		 */
		for(int i=y+1;i<8;i++)
		{
			int current=Game.cb.getElement(x,i);
			if(current==0)
			{
				moves.add(new Point(x,i));
			}
			else if(current/Math.abs(current)!=sign)
			{
				moves.add(new Point(x,i));
			}
		}
		/*
		 * 	Checking all possible moves belowthe rook.
		 */
		for(int i=y-1;i>-1;i--)
		{
			int current=Game.cb.getElement(x,i);
			if(current==0)
			{
				moves.add(new Point(x,i));
			}
			else if(current/Math.abs(current)!=sign)
			{
				moves.add(new Point(x,i));
			}
		}
		return moves;
		
	}

}
