/*
 * File: ExpandableArrayDemo.java
 * ------------------------------
 */

import acm.program.*;

public class ExpandableArrayDemo extends ConsoleProgram {

	public void run() {
		ExpandableArray myList = new ExpandableArray();
		myList.set(14, "Bob");
		myList.set(21, "Sally");

		String value = (String) myList.get(14);
		if (value != null) {
			println("Got value: " + value);
		}
	}
}
