package vetores_ex1;
import entities.Numeros;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		int numQty = sc.nextInt();
		Numeros[] listaNumeros = new Numeros[numQty];
		
		for (int i = 0; i<listaNumeros.length; i++) {
			System.out.println("Digite um número: ");
			int num = sc.nextInt();
			listaNumeros[i] = new Numeros(num);
		}
		
		System.out.println("Números negativos: ");
		
		for (int i = 0; i<listaNumeros.length; i++) {
			if (listaNumeros[i].getNumero() < 0) {
				System.out.println(listaNumeros[i].getNumero());				
			}
		}
		
		sc.close();
	}
}
