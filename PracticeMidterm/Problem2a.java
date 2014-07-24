/*
 * File: Problem2a.java
 * --------------------
 * Compute the value of each of the following Java expressions.
 * If an error occurs during any of these evaluations,
 * write "Error" on that line and explain briefly why the error occurs.
 */

import acm.program.*;

public class Problem2a extends ConsoleProgram {

	public void run() {
		println("5.0 / 4 - 4 / 5 is: " + (5.0 / 4 - 4 / 5));
		println("7 < 9 - 5 && 3 % 0 == 3 is: " + (7 < 9 - 5 && 3 % 0 == 3));
		println("\"B\" + 8 + 4 is: " + "B" + 8 + 4);
	}
}
