package application;

import entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;

public class ProblemaAlturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double somaAltura, mediaAltura;
		int contadorPessoasMenores16;
		int j = 0;
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int qtyPessoas = sc.nextInt();
		
		Pessoa[] listPessoas = new Pessoa[qtyPessoas];
		String[] nomePessoasMenores16 = new String[qtyPessoas];
		
		for (int i=0; i<listPessoas.length; i++) {
			System.out.printf("Dados da %da pessoa: \n", i+1);
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			listPessoas[i] = new Pessoa(nome, idade, altura);
		}
		somaAltura = 0;
		contadorPessoasMenores16 = 0;
		for (int i=0; i<listPessoas.length; i++) {
			somaAltura += listPessoas[i].getAltura();
			if (listPessoas[i].getIdade() < 16) {
				contadorPessoasMenores16++;
				nomePessoasMenores16[j] = listPessoas[i].getNome();
				j++;
			}
		}
		
		mediaAltura = somaAltura/listPessoas.length;
		double porcentagemPessoasMenores16 = ((double) contadorPessoasMenores16 / (double) listPessoas.length)*100;
		
		System.out.println("Altura média: " + mediaAltura);
		System.out.println("Pessoas com menos de 16 anos: " + porcentagemPessoasMenores16 + "%");
		System.out.println("Nome das pessoas menores de 16 anos: ");
		
		for (int i=0; i<j; i++) {
			System.out.println(nomePessoasMenores16[i]);
		}
		
		sc.close();

	}

}
