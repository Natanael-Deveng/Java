import objects.Aluno;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		
		System.out.print("Qual é o nome do aluno?");
		aluno1.nome = sc.nextLine();
		System.out.print("Qual foi a nota do aluno no 1º trimestre?");
		aluno1.nota1 = sc.nextDouble();
		System.out.print("Qual foi a nota do aluno no 2º trimestre?");
		aluno1.nota2 = sc.nextDouble();
		System.out.print("Qual foi a nota do aluno no 3º trimestre?");
		aluno1.nota3 = sc.nextDouble();
		
		sc.close();
		
		System.out.print(aluno1.resultado());

	}

}
