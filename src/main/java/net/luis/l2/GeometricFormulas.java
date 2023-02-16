package net.luis.l2;

import net.luis.util.Task;

/**
 *
 * @author Luis-st
 *
 */

public class GeometricFormulas {
	
	@Task("2.1.3 - 1")
	public static double calculateCirclePerimeter(double radius) {
		return 2 * Math.PI * radius;
	}
	
	@Task("2.1.3 - 2")
	public static double calculateTrianglePerimeter(double length) {
		return 3 * length;
	}

}
