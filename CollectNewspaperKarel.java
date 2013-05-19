/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * The CollectNewspaperKarel instructs Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house, facing east.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	public void run() {
		moveToBeeper();
		pickBeeper();
		returnToStart();
	}	
	
	/* moveToBeeper:  Starting from upper left corner of house, facing
	 * east, Karel moves to beeper, ending on top of beeper facing east
	 */
	
	private void moveToBeeper() {	
		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();	
	}

	/* returnToStart: After picking up the beeper, Karel is on the beeper
	 * spot facing east.  This method turns him around & returns him to
	 * upper left corner of house, facing east.
	 */
	
	private void returnToStart() {
		turnAround();
		while(frontIsClear()) {
			move();
		}
		turnRight();
		move();
		turnRight();
	}
}
