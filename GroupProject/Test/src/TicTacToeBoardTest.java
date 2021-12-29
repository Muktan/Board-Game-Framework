package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTacToeBoardTest {

	@Test
	void getBoardtest() {
		TicTacToeBoard t1 = new TicTacToeBoard();
		assertTrue(t1.getBoard(1,1).getClass().getSimpleName() == "Square");
	}

}
