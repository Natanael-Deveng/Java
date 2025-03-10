package objects;

public class Aluno {
	public String nome;
	public double nota1, nota2, nota3;

	
	public String resultado() {
		double notaFinal = nota1 + nota2 + nota3;
		if (notaFinal >= 60) {
			return "Nota final: " + notaFinal
					+ "\nPassou!";
		}
		else {
			double diferenca = 60 - notaFinal;
			return "Nota final: " + notaFinal
					+ "\nAluno Reprovado"
					+ "\nFaltaram: " + diferenca + " pontos.";
		}
			
	}
}
