package entities;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Digite o número da conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do titular: ");
		String nomeTitular = sc.nextLine();
		System.out.println("Haverá um depósito inicial? (y/n)");
		String temDepositoInicial = sc.next();
		if (temDepositoInicial.equals("y")) {
			System.out.println("Digite quanto você depositará: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroConta, nomeTitular, depositoInicial);
		}
		else {
			conta = new Conta(numeroConta, nomeTitular);
		}
		//System.out.println(conta.toString());
		System.out.println(conta.toString());
		
		System.out.println("\nDigite o valor do depósito: ");
		double qty = sc.nextDouble();
		conta.deposito(qty);
		
		//System.out.println(conta.toString());
		System.out.println("Conta: " + conta.getNumeroConta() + ", Titular: " + conta.getNomeTitular() + ", Saldo: " + conta.getSaldo());
		
		System.out.println("\nDigite o valor do saque: ");
		qty = sc.nextDouble();
		conta.saque(qty);
		
		//System.out.println(conta.toString());	
		System.out.println("Conta: " + conta.getNumeroConta() + ", Titular: " + conta.getNomeTitular() + ", Saldo: " + conta.getSaldo());
		
		sc.close();
	}

}
