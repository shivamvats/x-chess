# x-chess

* Hash-table for all possible types of pieces.

* Number white pieces as positive and black pieces as 
negative.

### Pawn:

Functions:

1. vector<points> get_possible_moves((x, y))

      * color = sign(number)

      * Simple move: A possible move = (x, y + color )

      * Attack move: A possible move = (x +- 1, y + color)

### Rook:

### Queen

### King

### Bishop

### Knight

### Code structure

	1. initialise chessboard
	2. getState()
	3. ask user for a location, whose piece he/she wants to move
	4. check if the location contains users's piece
	5. getPossibleMoves()
		*	dependent on piece class
		*	for each move made, confirm that king is not under check
		*	update possible moves
	6. display moves
	7. get final destination from user
	8. makeMove(A,B)
	9. check for checks and pawn upgrades
	10. go to 3 for opponent user

