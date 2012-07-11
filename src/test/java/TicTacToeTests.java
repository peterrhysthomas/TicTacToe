import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TicTacToeTests {
	
	private TicTacToe ticTacToe;
	
	@Before
	public void setUp(){
		ticTacToe = new TicTacToe();
	}

	@Test
	public void gameIsOverWhenAllCellsTaken() {
		assertTrue(ticTacToe.isGameOver("XOXOXXOOX"));
	}
	
	@Test
	public void gameIsOverWhenARowIsTakenByAPlayer(){
		assertTrue(ticTacToe.isGameOver("XXXOO-XO-"));
		assertTrue(ticTacToe.isGameOver("OOOXX-XO-"));
	}
	
	@Test
	public void gameContinuesIfThereAreEmptyCells(){
		assertFalse(ticTacToe.isGameOver("OXXXO-O--"));
	}
	
	@Test
	public void gameIsOverWhenAColumnIsTakenByAPlayer(){
		assertTrue(ticTacToe.isGameOver("X-OX--XOO"));
		assertTrue(ticTacToe.isGameOver("X-OOXOXOO"));
	}
	
	@Test
	public void gameIsOverWhenADiagonalIsTakenByAPlayer(){
		assertTrue(ticTacToe.isGameOver("X-O-XOO-X"));
		assertTrue(ticTacToe.isGameOver("X-O-OXO-X"));
	}

	@Test
	public void playerCanTakeCellWhichIsEmpty(){
		assertTrue(ticTacToe.canTakeCell("XX-OO-XO-", 2));
	}
	
	@Test
	public void playerCannotTakeACellWhichHasBeenUsed(){
		assertFalse(ticTacToe.canTakeCell("XX-OO-XO-", 1));
	}
}
