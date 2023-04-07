package test;

import org.junit.Test;  

public class BowlingGameTest {


	// Gutter game (20 times 0 pin) should score 0
	@Test
	public void testCase1() {
		BowlingGame game = new BowlingGame();
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		assert game.score() == 0;
	}
	
//	Rajesh -- Same way create method as testCase2 n inside write the logic for below cases as well
//	
//
//	// All one game (20 times 1 pin) should score 20
//	for (int i = 0; i < 20; i++) {
//	    game.roll(1);
//	}
//	assert game.score() == 20;
//
//	// A spare followed by a 3 should score 16
//	game.roll(5);
//	game.roll(5); // spare
//	game.roll(3);
//	for (int i = 0; i < 17; i++) {
//	    game.roll(0);
//	}
//	assert game.score() == 16;
//
//	// A strike followed by a 3 and a 4 should score 24
//	game.roll(10); // strike
//	game.roll(3);
//	game.roll(4);
//	for (int i = 0; i < 16; i++) {
//	    game.roll(0);
//	}
//	assert game.score() == 24;
//
//	// The perfect game (12 times 10) should score 300
//	for (int i = 0; i < 12; i++) {
//	    game.roll(10);
//	}
//	assert game.score() == 300;
}
