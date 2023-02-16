package net.luis.l2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis-st
 *
 */

class GeometricFormulasTest {
	
	@Test
	void calculateCirclePerimeter() {
		double radius = 5;
		double expected = 31.41592653589793;
		double actual = GeometricFormulas.calculateCirclePerimeter(radius);
		assertEquals(expected, actual);
	}
	
	@Test
	void calculateTrianglePerimeter() {
		double length = 5;
		double expected = 15;
		double actual = GeometricFormulas.calculateTrianglePerimeter(length);
		assertEquals(expected, actual);
	}
}