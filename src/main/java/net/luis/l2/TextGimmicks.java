package net.luis.l2;

import net.luis.util.Task;

/**
 *
 * @author Luis-st
 *
 */

public class TextGimmicks {

	@Task("2.2.3 - 1.1")
	public static String convertInUppercase(String text) {
		return text.toUpperCase();
	}
	
	@Task("2.2.3 - 1.2")
	public static String determineSubtext(String text, int cut) {
		return text.substring(0, cut);
	}

}
