package com.mitocode.util;

public class CurrencyConverter {

	//Esta variable es pública(public), global y estatica(por el static), constante(final).
	public static final double IGV = 0.18;
	
	public static double dollarToPen(double amount, double dollarPrice) {
		return amount*dollarPrice*IGV;
	}
}
