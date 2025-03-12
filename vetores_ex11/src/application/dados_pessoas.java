package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class dados_pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas? ");
		int qtyPessoas = sc.nextInt();
		
		Pessoas[] listaPessoas = new Pessoas[qtyPessoas];
		
		double menorAltura = 10;
		double maiorAltura = 0;
		double mediaAlturaMulheres = 0;
		double mediaAlturaHomens = 0;
		double somaAlturaHomens = 0;
		double somaAlturaMulheres = 0;
		int qtyMulheres = 0;
		int qtyHomens = 0;
		
		for(int i=0; i<listaPessoas.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			char genero = sc.next().charAt(0);
			listaPessoas[i] = new Pessoas(altura, genero);
			
			if (altura > maiorAltura) {
				maiorAltura = altura;
			}
			
			if (altura < menorAltura) {
				menorAltura = altura;
			}
			
			if (genero == 'M') {
				qtyHomens++;
				somaAlturaHomens += altura;
			} else {
				qtyMulheres++;
				somaAlturaMulheres += altura;
			}
		}
		
		mediaAlturaMulheres = somaAlturaMulheres/qtyMulheres;
		mediaAlturaHomens = somaAlturaHomens/qtyHomens;
		
		System.out.println("Menor altura: " + menorAltura);
		System.out.println("Maior altura: " + maiorAltura);
		System.out.printf("Media das alturas das mulheres: %.2f%n", mediaAlturaMulheres);
		System.out.printf("Media das alturas dos homens: %.2f%n", mediaAlturaHomens);
		System.out.println("Numero de mulheres: " + qtyMulheres);
		System.out.println("Numero de homens: " + qtyHomens);
		
		sc.close();
		
	}

}
