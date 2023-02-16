package net.luis.l2;

import net.luis.util.Task;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis-st
 *
 */

class CommercialFormulasTest {
	
	@Test
	@Task("2.1.3 - 3.1")
	void calculateGrossPrice() {
		double netPrice = 100;
		double expected = 119;
		double actual = CommercialFormulas.calculateGrossPrice(netPrice);
		assertEquals(expected, actual);
	}
	
	@Test
	@Task("2.1.3 - 3.2")
	void calculateDiscount() {
		double invoiceAmount = 100;
		double expected = 3;
		double actual = CommercialFormulas.calculateDiscount(invoiceAmount);
		assertEquals(expected, actual);
	}
	
	@Test
	void calculateNetPrice() {
		double productionPrice = 100;
		double expected = 109.35000000000001;
		double actual = CommercialFormulas.calculateNetPrice(productionPrice);
		assertEquals(expected, actual);
	}
	
	@Test
	void calculateProfitSurcharge() {
		double netPrice = 100;
		double expected = 135;
		double actual = CommercialFormulas.calculateProfitSurcharge(netPrice);
		assertEquals(expected, actual);
	}
}