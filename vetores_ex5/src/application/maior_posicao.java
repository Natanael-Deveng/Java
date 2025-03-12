package application;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

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
		
		int maiorValor = 0;
		int posicaoMaiorValor = 0;
		for(int i=0; i<vect.length; i++) {
			if (vect[i] > maiorValor) {
				maiorValor = vect[i];
				posicaoMaiorValor = i;
			}
		}
		
		System.out.println("Maior valor = " + maiorValor);
		System.out.println("Posicao do maior valor = " + posicaoMaiorValor);
		
		sc.close();

	}

}
