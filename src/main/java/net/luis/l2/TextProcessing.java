package net.luis.l2;

import net.luis.util.Task;

/**
 *
 * @author Luis-st
 *
 */

public class TextProcessing {
	
	@Task("2.1.4 - 1.1")
	public static int calculateTextLength(String text) {
		return text.length();
	}
	
	@Task("2.1.4 - 1.2")
	public static String convertInLowercase(String text) {
		return text.toLowerCase();
	}
	
}
