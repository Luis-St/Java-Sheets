package net.luis.l2;

import net.luis.util.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis-st
 *
 */

class GeometricFormulasTest {
	
	@Test
	@Task("2.1.3 - 1")
	void calculateCirclePerimeter() {
		double radius = 5;
		double expected = 31.41592653589793;
		double actual = GeometricFormulas.calculateCirclePerimeter(radius);
		assertEquals(expected, actual);
	}
	
	@Test
	@Task("2.1.3 - 2")
	void calculateTrianglePerimeter() {
		double length = 5;
		double expected = 15;
		double actual = GeometricFormulas.calculateTrianglePerimeter(length);
		assertEquals(expected, actual);
	}
}