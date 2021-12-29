package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChessGameRulesTest {

	@Test
	void checkOutOfBoundtest() {
		ChessGameRules chess1 = new ChessGameRules();
		boolean actual = chess1.checkOutOfBound(new Move());
		boolean expected = true;
		boolean actual1 = chess1.checkOutOfBound(new Move());
		boolean expected1= false;
		
		assertEquals(expected,actual);
		assertEquals(expected1,actual1);
		
	}
	@Test
	void checkAlreadyOccupiedTest() {
		ChessGameRules chess1 = new ChessGameRules();
		int actual1 = chess1.checkAlreadyOccupied(new Move(),new GameComponent());
		int actual2 = chess1.checkAlreadyOccupied(new Move(),new GameComponent());
		int actual3 = chess1.checkAlreadyOccupied(new Move(),new GameComponent());
		
		int expected1 = 0 ;
		int expected2 = 1 ;
		int expected3 = 2;
		
		assertEquals(expected1,actual1);
		assertEquals(expected2,actual2);
		assertEquals(expected2,actual3);
	}
	@Test
	void checkPieceAtPrevMovetest() {
		ChessGameRules chess1 = new ChessGameRules();
		boolean actual = chess1.checkPieceAtPrevMove(new Move(),new GameComponent());
		boolean expected = true;
		boolean actual1 = chess1.checkPieceAtPrevMove(new Move(),new GameComponent());
		boolean expected1= false;
		
		assertEquals(expected,actual);
		assertEquals(expected1,actual1);
		
	}
	@Test
	void checkPlayerPermissionstest() {
		ChessGameRules chess1 = new ChessGameRules();
		boolean actual = chess1.checkPlayerPermissions(new Move(),new GameComponent());
		boolean expected = true;
		boolean actual1 = chess1.checkPlayerPermissions(new Move(),new GameComponent());
		boolean expected1= false;
		
		assertEquals(expected,actual);
		assertEquals(expected1,actual1);
	}
	@Test
	void checkPieceMovementCorrectnesstest(){
		ChessGameRules chess1 = new ChessGameRules();
		boolean actual = chess1.checkPieceMovementCorrectness(new Move(),new GameComponent(), true);
		boolean expected = true;
		boolean actual1 = chess1.checkPieceMovementCorrectness(new Move(),new GameComponent(),false);
		boolean expected1= false;
		
		assertEquals(expected,actual);
		assertEquals(expected1,actual1);	
	}
}
