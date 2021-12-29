package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChessBoardTest {

	@Test
	void getBoardtest() {
		ChessBoard c1 = new ChessBoard();
		assertTrue(c1.getBoard().getClass().getSimpleName() == "Square");
	}

}
