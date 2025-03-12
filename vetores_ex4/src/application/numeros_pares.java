package application;

import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		int qtyNum = sc.nextInt();
		
		int[] vect = new int[qtyNum];
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Digite um número: ");
			int num = sc.nextInt();
			vect[i] = num;
		}
		
		System.out.println("Numeros pares: ");
		
		int j = 0;
		for(int i=0; i<vect.length; i++) {
			if (vect[i]%2 == 0) {
				System.out.print(vect[i] + " ");
				j++;
			}
		}
		
		System.out.println("\nQuantidade de pares: " + j);
		
		sc.close();

	}

}
