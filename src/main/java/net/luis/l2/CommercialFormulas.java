package net.luis.l2;

import net.luis.util.Task;

/**
 *
 * @author Luis-st
 *
 */

public class CommercialFormulas {
	
	@Task("2.1.3 - 3.1")
	public static double calculateGrossPrice(double netPrice) {
		return netPrice * (1.0 + 0.19);
	}
	
	@Task("2.1.3 - 3.2")
	public static double calculateDiscount(double invoiceAmount) {
		return invoiceAmount * 0.03;
	}
	
}
