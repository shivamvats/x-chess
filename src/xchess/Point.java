package xchess;

public class Point { 
	public int x; 
	public int y;

	public Boolean equals(Point other) {
		if(this.x == other.x && this.y == other.y)
			return true;
		else
			return false;
	}
	
} 