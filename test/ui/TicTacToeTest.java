package ui;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicTacToeTest {

	@Test
	public void testGetXO() {
	
		assertTrue("X", TicTacToe.getXO(1).equals("X"));
	
	}

	@Test
	public void testGetComputerMove() {

		TicTacToe.A1 = 0;
		assertTrue("A1", TicTacToe.getComputerMove().equals("A1"));
		
	}

}
