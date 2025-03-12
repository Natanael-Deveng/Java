package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class pensionato {
	// Solucao mais elegante
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos serão alugados? ");
		int qtyQuartos = sc.nextInt();
		int qtyTotalQuartos = 10;
		sc.nextLine();
		
		Quartos[] listaQuartos = new Quartos[qtyTotalQuartos];
		
		for (int i=0; i<qtyQuartos; i++) {
			System.out.println((i+1) + "º inquilino: ");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			//sc.nextLine();
			System.out.print("Número do quarto: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			
			listaQuartos[quarto-1] = new Quartos(nome, email, quarto);
		}
		
		System.out.println("Quartos ocupados:");

		for (int i=0; i<listaQuartos.length; i++) {
			if (listaQuartos[i] != null) {
				System.out.println(listaQuartos[i].quartosOcupados());
			}
		}
		
		sc.close();

	}

}
