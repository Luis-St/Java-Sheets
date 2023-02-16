package net.luis.l2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis-st
 *
 */

class CommercialFormulasTest {
	
	@Test
	void calculateGrossPrice() {
		double netPrice = 100;
		double expected = 119;
		double actual = CommercialFormulas.calculateGrossPrice(netPrice);
		assertEquals(expected, actual);
	}
	
	@Test
	void calculateDiscount() {
		double invoiceAmount = 100;
		double expected = 3;
		double actual = CommercialFormulas.calculateDiscount(invoiceAmount);
		assertEquals(expected, actual);
	}
}