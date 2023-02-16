package net.luis.l2;

/**
 *
 * @author Luis-st
 *
 */

public class CommercialFormulas {
	
	public static double calculateGrossPrice(double netPrice) {
		return netPrice * (1.0 + 0.19);
	}
	
	public static double calculateDiscount(double invoiceAmount) {
		return invoiceAmount * 0.03;
	}
	
}
