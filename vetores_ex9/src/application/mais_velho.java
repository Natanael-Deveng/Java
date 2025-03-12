package application;

import entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;

public class mais_velho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas você vai digitar? ");
		int qtyPessoas = sc.nextInt();
		
		Pessoa[] listaPessoas = new Pessoa[qtyPessoas];
		
		int maiorIdade = 0;
		String pessoaMaisVelha = "";
		
		for (int i=0; i<listaPessoas.length; i++) {
			System.out.printf("Dados da %da pessoa", i+1);
			System.out.print("\nNome: ");
			String nome = sc.next();
			//sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			listaPessoas[i] = new Pessoa(nome, idade);
			if (idade > maiorIdade) {
				maiorIdade = idade;
				pessoaMaisVelha = listaPessoas[i].getNome();
			}
		}
		
		System.out.println("Pessoa mais velha: " + pessoaMaisVelha);
		
		sc.close();
	}

}
