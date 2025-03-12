package application;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		int qtyNum = sc.nextInt();
		
		double[] vect = new double[qtyNum];
		
		double soma = 0;
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Digite um número: ");
			double num = sc.nextDouble();
			vect[i] = num;
			soma += vect[i];
		}
		
		double media = soma / vect.length;
		
		System.out.printf("Media do vetor: %.3f%n", media);
		
		System.out.println("Elementos abaixo da media: ");

		for(int i=0; i<vect.length; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}

}
