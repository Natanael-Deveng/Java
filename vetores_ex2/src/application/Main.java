package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números você vai digitar? ");
		int numerosQty = sc.nextInt();
		int[] numVect = new int[numerosQty];
		
		for(int i = 0; i < numerosQty; i++) {
			System.out.println("Digite um numero: ");
			numVect[i] = sc.nextInt();
		}
		
		System.out.print("Valores: ");
		
		for(int i=0; i<numVect.length; i++) {
			System.out.print(numVect[i] + " ");
		}
		
		int sum = 0;
		
		for(int i=0; i<numVect.length; i++) {
			sum += numVect[i];
		}
		
		double media = sum/numVect.length;
		
		System.out.println("Média: " + media);
		
		sc.close();
	}

}
