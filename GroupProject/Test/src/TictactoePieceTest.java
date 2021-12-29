package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TictactoePieceTest {

	@Test
	void getPiecetest() {
		TictactoePiece c1 = new TictactoePiece();
		assertTrue(((Object)c1.belongsTo).getClass().getSimpleName() == "Integer");
	}
	@Test
	void getBelongsToTest() {
		TictactoePiece c1 = new TictactoePiece();
		assertTrue(((Object)c1.belongsTo).getClass().getSimpleName() == "Player");
	}

}
