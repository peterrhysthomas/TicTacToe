import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TicTacToeTests {

	@Test
	public void gameIsOverWhenAllCellsTaken() {
		String cells = "XOXOXXOOX";
		boolean gameOver = !cells.contains("-");
		assertTrue(gameOver);
	}
	
	@Test
	@Ignore
	public void gameIsOverWhenAColumnIsTakenByAPlayer(){
	}

	@Test
	@Ignore
	public void gameIsOverWhenARowIsTakenByAPlayer(){
	}
	
	@Test
	@Ignore
	public void gameIsOverWhenADiagonalIsTakenByAPlayer(){
	}
	
	@Test
	@Ignore
	public void gameContinuesIfThereAreEmptyCells(){
	}
	
	@Test
	@Ignore
	public void playerCanTakeCellWhichIsEmpty(){
	}
}
