import java.util.HashSet;
import java.util.Set;


public class TicTacToe {
	
	private static final String PLAYER_ONE_WINNER = "XXX";
	private static final String PLAYER_TWO_WINNER = "OOO";
	private static final String EMPTY_CELL = "-";

	public boolean isGameOver(String cells) {
		return areAllCellsTaken(cells) || isRowTaken(cells) || isColumnTaken(cells) || isDiagonalTaken(cells);
	}
	
	public boolean canTakeCell(String cells, int position) {
		return EMPTY_CELL.equals(cells.substring(position, position+1));
	}
	
	private boolean areAllCellsTaken(String cells) {
		return !cells.contains(EMPTY_CELL);
	}

	private boolean isRowTaken(String cells) {
		return checkForWinner(getRows(cells));
	}

	private boolean isColumnTaken(String cells) {
		return checkForWinner(getColumns(cells));
	}

	private boolean isDiagonalTaken(String cells) {
		Set <String> diagonals = getDiagonals(cells);
		return checkForWinner(diagonals);
	}

	private boolean checkForWinner(Set<String> columns) {
		return columns.contains(PLAYER_ONE_WINNER) || columns.contains(PLAYER_TWO_WINNER);
	}

	private Set<String> getColumns(String cells) {
		Set<String> columns = new HashSet<String>();
		columns.add(cells.substring(0, 1) + cells.substring(3, 4) + cells.substring(6, 7));
		columns.add(cells.substring(1, 2) + cells.substring(4, 5) + cells.substring(7, 8));
		columns.add(cells.substring(2, 3) + cells.substring(5, 6) + cells.substring(8, 9));
		return columns;
	}
	
	private Set<String> getRows(String cells) {
		Set<String> rows = new HashSet<String>();
		rows.add(cells.substring(0, 3));
		rows.add(cells.substring(3, 6));
		rows.add(cells.substring(6, 9));
		return rows;
	}

	private Set<String> getDiagonals(String cells) {
		Set<String> diagonals = new HashSet<String>();
		diagonals.add(cells.substring(0,1) + cells.substring(4,5) + cells.substring(8,9));
		diagonals.add(cells.substring(2,3) + cells.substring(4,5) + cells.substring(6,7));
		return diagonals;
	}
}
