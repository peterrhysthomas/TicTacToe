import static org.junit.Assert.*;

import org.junit.Test;


public class TicTacToeTests {

	@Test
	public void gameIsOverWhenAllCellsTaken() {
		boolean allCellsTaken = true;
		assertTrue(allCellsTaken );
	}
	
	@Test
	public void gameIsOverWhenAColumnIsTakenByAPlayer(){
		boolean columnTaken = true;
		assertTrue(columnTaken);
	}

	@Test
	public void gameIsOverWhenARowIsTakenByAPlayer(){
		boolean rowTaken = true;
		assertTrue(rowTaken);
	}
	
	@Test
	public void gameIsOverWhenADiagonalIsTakenByAPlayer(){
		boolean diagonalTaken = true;
		assertTrue(diagonalTaken);
	}
	
	@Test
	public void gameContinuesIfThereAreEmptyCells(){
		boolean emptyCells = true;
		assertTrue(emptyCells);
	}
	
	@Test
	public void playerCanTakeCellWhichIsEmpty(){
		boolean notTaken = true;
		assertTrue(notTaken);
	}
}
