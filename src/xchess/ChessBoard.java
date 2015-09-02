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
		board[7][0] = -2;
		board[7][7] = -2;
		board[0][0] = 2;
		board[0][7] = 2;
		
		//Knights
		board[7][1] = -3;
		board[7][6] = -3;
		board[0][1] = 3;
		board[0][6] = 3;
		
		//Bishops
		board[7][2] = -4;
		board[7][5] = -4;
		board[0][2] = 4;
		board[0][5] = 4;
		
		//Queen and King
		board[7][3] = -5;
		board[7][4] = -6;
		board[0][3] = 5;
		board[0][4] = 6;
		
		//Pawns
		for(int i=0; i<8; i++)
			board[6][i] = -1;
		
		for(int i=0; i<8; i++)
			board[1][i] = 1;
	}
	/**
	 * Print the element info at location (a,b) of chess board to the screen.
	 * Return -7 if location is invalid
	 */
	public int getElement(int a, int b)
	{
		if(a>-1 && b>-1 && a<8 && b<8) return board[a][b];
		else return -7;
	}
	
	/**
	 * Print the current state of chess board to the screen.
	 */
	public void getState() {
		for(int i=rows-1; i>=0; i--) {
			for(int j=0; j<=cols-1; j++) {
				System.out.print("| ");
				if(i<6)
					System.out.print(" ");
				System.out.print(board[i][j] + " ");
			}
			System.out.print("|");
			System.out.println();
		}
	}
}
