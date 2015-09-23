package xchess;

import java.util.ArrayList;

public class Queen extends Piece {

	public static ArrayList<Point> getPossibleMoves(Point current) {
		ArrayList<Point> moves = new ArrayList<Point>();
		//Queen moves = Rook moves + Bishop moves
		moves.addAll(Rook.getPossibleMoves(current));
		moves.addAll(Bishop.getPossibleMoves(current));
		return moves;
	}
}
