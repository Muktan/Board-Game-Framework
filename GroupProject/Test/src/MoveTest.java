package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoveTest {

	@Test
	void getPrevLocationXtest() {
		Move m1 = new Move();
		int actual = m1.getPrevLocationX();
		int expected = -1;
		assertTrue(actual>expected);
		
	}
	@Test
	void getPrevLocationYtest() {
		Move m1 = new Move();
		int actual = m1.getPrevLocationY();
		int expected = -1;
		assertTrue(actual>expected);
		
	}
	@Test
	void getCurrLocationXtest() {
		Move m1 = new Move();
		int actual = m1.getCurrLocationX();
		int expected = -1;
		assertTrue(actual>expected);
	}
	@Test
	void getCurrLocationYtest() {
		Move m1 = new Move();
		int actual = m1.getCurrLocationY();
		int expected = -1;
		assertTrue(actual>expected);
		
	}

}
