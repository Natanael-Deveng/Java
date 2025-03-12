package application;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int qtyNum = sc.nextInt();
		
		double[] vect = new double[qtyNum];
		
		double somaPares = 0;
		
		int j = 0;
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Digite um número: ");
			double num = sc.nextDouble();
			vect[i] = num;
			if(vect[i] % 2 == 0) {
				somaPares += vect[i];
				j++;
			}
		}
		
		double mediaPares = somaPares / j;
		
		if(somaPares != 0) {
			System.out.printf("Media dos pares: %.3f%n", mediaPares);
		} else {
			System.out.println("Nenhum numero par");
		}

		sc.close();

	}

}
