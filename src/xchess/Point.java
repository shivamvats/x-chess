package xchess;

public class Point { 
	private int x; 
	private int y;
	
	public Point(int a, int b)
	{
		x=a;
		y=b;
	}
	public int getX() {return this.x;}
	public int getY() {return this.y;}
	
	public Boolean equals(Point other) {
		if(this.x == other.getX() && this.y == other.getY())
			return true;
		else
			return false;
	}

	public String toString()
	{
		return("(" +x+","+y+")");
	}
} 

