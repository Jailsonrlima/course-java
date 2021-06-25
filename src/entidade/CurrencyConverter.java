package entidade;

public class CurrencyConverter {

	public static final double IOF = 6.0;
	
	public static double Converter(double price, double quantidade) {
		return price * quantidade * IOF / 100;
	}


}
