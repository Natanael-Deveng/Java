import entities.CurrencyConverter;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a cotação do dólar: ");
		double dolarCot = sc.nextDouble();
		System.out.print("Informe a quantidade de dolares que você deseja comprar: ");
		double dolarQty = sc.nextDouble();
		double reais = CurrencyConverter.converter(dolarCot, dolarQty);
		System.out.printf("A quantidade a ser pago em reais é de: %.2f%n", reais);
		
		
		
		sc.close();
	}

}
