/*
 * File: CreateBeeperLine.java
 * ---------------------------
 */

import stanford.karel.*;

public class CreateBeeperLine extends Karel {

	public void run() {
		createBeeperLine();
	}

	private void createBeeperLine() {
		while (frontIsClear()) {
			putBeeper();
			move();
		}
		putBeeper();
	}
}
