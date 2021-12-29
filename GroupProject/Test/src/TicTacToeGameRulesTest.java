package io.javabrains;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TicTacToeGameRulesTest {

	@Test
	void ValidateMovetest() {
		TicTacToeGameRules tictactoe = new TicTacToeGameRules();
		boolean actual = tictactoe.validateMove(new Move(), new GameComponent());
		boolean expected = true;
		assertEquals(expected,actual);
	}
	@Test
	void checkEndGametest() {
		TicTacToeGameRules tictactoe = new TicTacToeGameRules();
		int actual = tictactoe.checkGameEnd(new GameComponent());
		int actual2 = tictactoe.checkGameEnd(new GameComponent());
		int actual3 = tictactoe.checkGameEnd(new GameComponent());
		int expected = 1;
		int expected2 = 0;
		int expected3 = 2;
		assertEquals(expected,actual);
		assertEquals(expected2,actual2);
		assertEquals(expected3,actual3);
	}
	@Test
	void checkBoardFulltest() {
		TicTacToeGameRules tictactoe = new TicTacToeGameRules();
		boolean actual = tictactoe.check_board_full(new TicTacToeBoard());
		boolean actual2 = tictactoe.check_board_full(new TicTacToeBoard());
		
		boolean expected = true;
		boolean expected2 = false;
		
		assertEquals(expected,actual);
		assertEquals(expected2,actual2);
	}
}
