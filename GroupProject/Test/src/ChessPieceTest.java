package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChessPieceTest {

	@Test
	void getPiecetest() {
		ChessPiece c1 = new ChessPiece();
		assertTrue(((Object)c1.belongsTo).getClass().getSimpleName() == "Integer");
	}
	@Test
	void getBelongsToTest() {
		ChessPiece c1 = new ChessPiece();
		assertTrue(((Object)c1.belongsTo).getClass().getSimpleName() == "Player");
	}

}
