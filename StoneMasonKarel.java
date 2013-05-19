/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
				fixColumn();
				moveToNextColumn();
		}
		fixColumn();
	}

	/* fixColumn:  Karel starts at bottom of column, facing east. He turns
	 * north, places line of beepers in empty spots, turns around, and
	 * returns to his start position facing east.
	 */
	
	private void fixColumn() {
		fillColumn();
		returnToStart();
	}
	
	/* fillColumn:  Karel starts at bottom of column, facing east.  If 
	 * current position has no beeper, puts beeper.  Then proceeds up
	 * column placing beepers in empty spots, ending at top of column
	 * facing north.
	 */
	
	private void fillColumn() {
		turnLeft();
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
			}	
			move();
		}
		if (noBeepersPresent()) {
			putBeeper();
		}	
	}
	
	/* returnToStart:  Karel starts at top of column facing north.
	 * He turns around, returns to bottom of column, and turns to end
	 * facing east.
	 */
	
	private void returnToStart() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnLeft();
	}
	
	/* moveToNextColumn:  Karel starts at bottom of column facing east.
	 * He moves to a column 4 avenues in front of his starting position.
	 * Note that this will only work while frontIsClear & for columns
	 * spaced 4 columns apart.
	 */
	
	private void moveToNextColumn() {
		for (int i=0; i < 4; i++) {
			move();
		}
	}
}
