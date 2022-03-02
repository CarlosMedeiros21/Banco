
import java.util.Scanner;

public class ContaUnica {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String aux;
		
		 System.out.println("");
		 System.out.println("Digite o Titular da Conta: ");
		 System.out.println(" ");
		 aux = in.nextLine();
		 int opcao;
		 double valor;
		 
		 
		 Conta c1 = new Conta(aux);
		 
		 do {
			 System.out.println("");
			 System.out.println(" -- Menu de Opção -- ");
			 System.out.println(" ");
			 System.out.println("1 - Dados Bancarios ");
			 System.out.println("2 - Depósito ");
			 System.out.println("3 - Saque ");
			 System.out.println("0 - Sair");
			 System.out.println(" ");
			 System.out.print("Digite a Opção: ");
			 opcao = in.nextInt();
			 
			 if(opcao == 1) {
				 c1.DadosBancarios();
			 }
			 else if(opcao == 2) {
				 System.out.println("");
				 System.out.println("Digite o valor do depósito: ");
				 valor = in.nextDouble();
				 
				 c1.Depositar(valor);
			 }
			 else if(opcao == 3) {
				 System.out.println("");
				 System.out.println("Digite o valor do Saque: ");
				 valor = in.nextDouble();
				 
				 c1.Sacar(valor);
			 }
			 else if(opcao != 0) {
				 System.out.println("");
				 System.out.println("Opção invalida , digite uma nova opção :  ");
			 }
			 
		 }while(opcao != 0);
		

	}
}
