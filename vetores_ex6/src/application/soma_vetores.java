package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores terão cada vetor? ");
		int qtyNum = sc.nextInt();
		
		int[] vectA = new int[qtyNum];
		int[] vectB = new int[qtyNum];
		int[] vectC = new int[qtyNum];
		
		System.out.println("Digite os valores do vetor A: ");
		
		for(int i=0; i<vectA.length; i++) {
			int num = sc.nextInt();
			vectA[i] = num;
		}
		
		System.out.println("Digite os valores do vetor B: ");
		
		for(int i=0; i<vectB.length; i++) {
			int num = sc.nextInt();
			vectB[i] = num;
		}
		
		for(int i=0; i<vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("Vetor resultante: " + Arrays.toString(vectC));		
		
		sc.close();

	}

}
