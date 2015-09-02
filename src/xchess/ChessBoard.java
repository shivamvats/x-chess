package xchess;

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
	 * State of chess board. Initialized to 0 by default. Do it manually?
	 */
	private int[][] board = new int[rows][cols];
	
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
			for(int j=cols-1; j>=0; j--) {
				System.out.print("| ");
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
