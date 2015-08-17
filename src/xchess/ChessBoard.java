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
}
