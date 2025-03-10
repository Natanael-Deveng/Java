package objects;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	public double aumentoPercentual;
	
	public double salarioLiquido () {
		return salarioBruto - imposto;
	}
	
	public double calculaAumento () {
		return (salarioBruto + salarioBruto * aumentoPercentual / 100) - imposto;		
	}
	
	public String toString() {
		return "O salário líquido do funcionário " + nome + " é de " + salarioLiquido();  
	}
	
	public String salarioAtualizado () {
		return "O salário líquido do funcionário " + nome + " após o aumento de " + aumentoPercentual + "%" + " é de " + calculaAumento();
	}
}
