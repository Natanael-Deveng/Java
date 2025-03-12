package application;

import alunos.Alunos;
import java.util.Locale;
import java.util.Scanner;

public class aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serao digitados? ");
		int qtyAlunos = sc.nextInt();
		
		Alunos[] listaAlunos = new Alunos[qtyAlunos];
		sc.nextLine();
		for (int i=0; i<listaAlunos.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno\n", i+1);
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			sc.nextLine();
			listaAlunos[i] = new Alunos(nome, nota1, nota2);
		}
		
		System.out.println("Alunos aprovados: ");
		
		for (int i=0; i<listaAlunos.length; i++) {
			if ((listaAlunos[i].getNota1()+listaAlunos[i].getNota2())/2 >= 6) {
				System.out.println(listaAlunos[i].getNome());
			}
		}
		
		sc.close();
	}

}
