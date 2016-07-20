package mediator;

public interface IReversiMediator {
	Cell move(Player player, int iRow, int jColumn);
	void markCells(Player player, int iRow, int jCol);
	boolean isValidMove(Player player, int iRow, int jCol);
    Cell isGameOver();
	Board getBoard();
}
