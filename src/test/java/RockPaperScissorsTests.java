import static org.junit.Assert.*;

import org.junit.Test;


public class RockPaperScissorsTests {

	@Test
	public void rockBeatsPaper() {
		assertEquals("Rock", play("Rock", "Paper"));
	}

	private String play(String player1, String player2) {
		String winner = ""; 
		if (player1.equals("Rock") && player2.equals("Paper")){
			winner = player1;
		}
		return winner;
	}

}
