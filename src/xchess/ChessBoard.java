package xchess;

import java.util.HashMap;

public class ChessBoard {
	
	/**
	 * Number of Ranks in the board.
	 */
	private int rows = 8;
	
	/**
	 * Number of Files in the board.
	 */
	private int cols = 8;
	
	/**
	 * State of chess board. Initialized to 0 by default.
	 */
	private int[][] board = new int[rows][cols];
	
	/**
	 * HashMap mapping an int to it's corresponding piece.
	 */
	public static HashMap<Integer, Class<? extends Piece>> pieces;
	
	public ChessBoard() {
		pieces = new HashMap<Integer, Class<? extends Piece>>();
		pieces.put(1, Pawn.class);
		pieces.put(2, Rook.class);
		pieces.put(3, Knight.class);
		pieces.put(4, Bishop.class);
		pieces.put(5, Queen.class);
		pieces.put(6, King.class);
		fillBoard();
	}
	
	private void fillBoard() {
		
		//Rooks
		board[0][7] = -2;
		board[7][7] = -2;
		board[0][0] = 2;
		board[7][0] = 2;
		
		//Knights
		board[1][7] = -3;
		board[6][7] = -3;
		board[1][0] = 3;
		board[6][0] = 3;
		
		//Bishops
		board[2][7] = -4;
		board[5][7] = -4;
		board[2][0] = 4;
		board[5][0] = 4;
		
		//Queen and King
		board[3][7] = -5;
		board[4][7] = -6;
		board[3][0] = 5;
		board[4][0] = 6;
		
		//Pawns
		for(int i=0; i<8; i++)
			board[i][6] = -1;
		
		for(int i=0; i<8; i++)
			board[i][1] = 1;
	}
	/**
	 * Print the element info at location (a,b) of chess board to the screen.
	 * Return -7 if location is invalid
	 */
	public int getElement(int a, int b)
	{
		if(a>-1 && b>-1 && a<rows && b<cols) return board[a][b];
		else return -7;
	}
	
	/**
	 * Print the current state of chess board to the screen.
	 */
	public void getState() {
		for(int j=cols-1; j>=0; j--) {
			for(int i=0; i<=rows-1; i++) {
				System.out.print("| ");
				if(j<6)
					System.out.print(" ");
				System.out.print(board[i][j] + " ");
			}
			System.out.print("|");
			System.out.println();
		}
	}
	
	public void set(Point pt, int piece) {
		board[pt.getX()][pt.getY()] = piece;
	}
}
