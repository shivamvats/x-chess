package xchess;

import java.util.Scanner;

public class Game {
	public static ChessBoard cb = new ChessBoard();
	private static int turn = 1;
	
	public static void main(String[] args) {
		while(true) {
		cb.getState();
		Point movePosition = choosePiece();
		//m = r.getPossibleMoves(new Point(3,4));
		//for(int i=0;i<m.size();i++)
		//{
		//	System.out.println((m.get(i)));
		//}
		}
		
	}

	private static Point choosePiece() {
		while(true) {
			System.out.println("Enter coordinates of the piece to be moved\n");
			int x, y;
			Scanner in = new Scanner(System.in);
			x = in.nextInt();
			y = in.nextInt();
			if((x >= 0 && x < 8) && (y >= 0 && y< 8) &&(turn == (int)Math.signum(cb.getElement(x, y))))
					return new Point(x, y);
			else
				System.out.println("Please enter a valid position\n");
		}
			
	}
}
