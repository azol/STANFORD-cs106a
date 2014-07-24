/*
 * File: StringQueueDemo.java
 * --------------------------
 */

import acm.program.*;

public class StringQueueDemo extends ConsoleProgram {

	public void run() {
		println("StringQueue sq = new StringQueue();");
		StringQueue sq = new StringQueue();
		println("sq.add(\"Hello\");");
		sq.add("Hello");
		println("println(sq.size());");
		println("");
		println("Result is:");
		println(sq.size());
	}
}
