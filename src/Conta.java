
public class Conta {
	
	private int numero;
	private String titular;
	private double saldo;
	private int qtdcontas = 0;
	
	public Conta(String pTitular) {
		this.titular = pTitular;
		qtdcontas++;
		this.numero = qtdcontas;
		this.saldo = 0;
	}
	
	public void DadosBancarios() {
		System.out.println("");
		System.out.println(" -- Dados Banc�rios --");
		System.out.println(" ");
		System.out.println(" Numero: "+ this.numero);
		System.out.println(" Titular: "+ this.titular);
		System.out.println(" Saldo: "+ this.saldo);
		System.out.println(" ");
		System.out.println(" -- Fim dos Dados Banc�rios --");
	}
	
	public void Depositar(double pValor) {
		System.out.println("");
		System.out.println(" -- Realizando Dep�sito --");
		System.out.println(" ");
		System.out.println(" Saldo Anterior: "+ this.saldo);
		
		this.saldo = this.saldo + pValor;
		
		System.out.println(" Saldo Atual: "+ this.saldo);
		System.out.println(" ");
		System.out.println(" -- Fim do Dep�sito --");
	}
	
	public void Sacar(double pValor) {
		System.out.println("");
		System.out.println(" --  Realizando Saque");
		System.out.println(" ");
		System.out.println(" Saldo Anterior: "+ this.saldo);
		
		if(pValor <= this.saldo){
			this.saldo = this.saldo - pValor;
			System.out.println(" Saldo Atual: "+ this.saldo);
		}
		else {
			System.out.println("Saldo Indispon�vel");
		}
		System.out.println(" ");
		System.out.println(" -- Fim de Saque -- ");
	}

}
