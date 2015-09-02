package xchess;

import java.util.ArrayList;

public class Bishop extends Piece {
public ArrayList<Point> getPossibleMoves(Point p)
	{
		ArrayList<Point> moves= new ArrayList<Point>();
		int x=p.getX(),y=p.getY();

		System.out.println( "Accessing piece at location (" + x + "," + y + ")" );	
		int sign = (int)Math.signum(Game.cb.getElement(x,y));

		for(int i=x+1;i<8;i++)
		{
                    
                    for(int j=1;j<8-y;j++)
                    {
                        if((int)Math.signum(Game.cb.getElement(i,y+j))!=sign)
			{
				moves.add(new Point(i,y+j));
			}
                        if(Game.cb.getElement(i,y+j)!=0)break;

                    }
                    for(int j=-1;j>=(-y);j--)
                    {
                        if((int)Math.signum(Game.cb.getElement(i,y+j))!=sign)
			{
				moves.add(new Point(i,y+j));
			}
                        if(Game.cb.getElement(i,y+j)!=0)break;

                    }
			
		}
                for(int i=x-1;i>=0;i--)
		{
                    
                    for(int j=1;j<8-y;j++)
                    {
                        if((int)Math.signum(Game.cb.getElement(i,y+j))!=sign)
			{
				moves.add(new Point(i,y+j));
			}
                        if(Game.cb.getElement(i,y+j)!=0)break;
                    }
                    for(int j=-1;j>=(-y);j--)
                    {
                        if((int)Math.signum(Game.cb.getElement(i,y+j))!=sign)
			{
				moves.add(new Point(i,y+j));
			}
                        if(Game.cb.getElement(i,y+j)!=0)break;

                    }
			
		}
		
		
		return moves;
		
	}
}
