package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos serão alugados? ");
		int qtyQuartos = sc.nextInt();
		sc.nextLine();
		
		Quartos[] listaQuartos = new Quartos[qtyQuartos];
		
		for (int i=0; i<listaQuartos.length; i++) {
			System.out.println((i+1) + "º inquilino: ");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			//sc.nextLine();
			System.out.print("Número do quarto: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			
			listaQuartos[i] = new Quartos(nome, email, quarto);
		}
		
		System.out.println("Quartos ocupados:");
		int j = 1;
		while (j <= 10) {
			for (int i=0; i<listaQuartos.length; i++) {
				if (listaQuartos[i].getQuarto() == j) {
					System.out.println(listaQuartos[i].quartosOcupados());
				}
			}
			j++;
		}
		
		sc.close();

	}

}
