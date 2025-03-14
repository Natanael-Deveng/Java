package entities;

public class Conta {
	private int numeroConta;
	private double saldo;
	private String nomeTitular;
	
	public Conta() {
	}
	
	public Conta (int numeroConta, String nomeTitular, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
	
	public Conta (int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		saldo = 0;
	}
	
	public double getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nome) {
		this.nomeTitular = nome;
	}
	
	public String deposito(double qty) {
		this.saldo += qty; 
		return "Conta: "
				+ numeroConta
				+ ", Titular: "
				+ nomeTitular
				+ ", Saldo: "
				+ saldo;
				
	}
	
	public String saque(double qty) {
		this.saldo = this.saldo - qty - 5;
		return "Conta: "
				+ numeroConta
				+ ", Titular: "
				+ nomeTitular
				+ ", Saldo: "
				+ saldo;
	}
	
	public String toString() {
		return "\nDados da conta \nConta: "
				+ numeroConta
				+ ", Titular: "
				+ nomeTitular
				+ ", Saldo: "
				+ saldo;
	}
}
