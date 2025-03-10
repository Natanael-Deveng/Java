package entities;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double converter(double dolarCot, double dolarQty) {
		double reaisQty = dolarQty * dolarCot;
		return reaisQty + reaisQty*IOF;
	}
}
