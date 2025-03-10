import objects.Funcionario;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Funcionario funcionario1 = new Funcionario();
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o nome do funcionário: ");
		funcionario1.nome = sc.nextLine();
		System.out.printf("Informe o salário bruto do %s: ", funcionario1.nome);
		funcionario1.salarioBruto = sc.nextDouble();
		System.out.print("Informe o imposto que será descontado: ");
		funcionario1.imposto = sc.nextDouble();
		
		System.out.println(funcionario1.toString());
		
		System.out.print("Informe em porcentagem o aumento salarial: ");
		funcionario1.aumentoPercentual = sc.nextDouble();
		
		System.out.print(funcionario1.salarioAtualizado());

		sc.close();

	}

}
