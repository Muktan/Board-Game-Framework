package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CrazyHouseChessGameRulesTest {

	@Test
	void ValidateMovetest() {
		CrazyHouseChessGameRules chess = new CrazyHouseChessGameRules();
		boolean actual = chess.validateMove(new Move(), new GameComponent());
		boolean expected = true;
		assertEquals(expected,actual);
	}
	@Test
	void checkEndGametest() {
		CrazyHouseChessGameRules chess1 = new CrazyHouseChessGameRules();
		int actual = chess1.checkGameEnd(new GameComponent());
		int actual2 = chess1.checkGameEnd(new GameComponent());
		int actual3 = chess1.checkGameEnd(new GameComponent());
		int expected = 1;
		int expected2 = 0;
		int expected3 = 2;
		assertEquals(expected,actual);
		assertEquals(expected2,actual2);
		assertEquals(expected3,actual3);
	}


}
