package poo;

public class ContaBancaria {
			int numConta;
			String dono;
			String tipo;
			double saldo;
			public ContaBancaria(int numConta, String dono, String tipo, double saldo) {
				super();
				this.numConta = numConta;
				this.dono = dono;
				this.tipo = tipo;
				this.saldo = saldo;
			}
			
			void status()
			{
				System.out.println("O n�mero da conta �: "+numConta);
				System.out.println("Propriet�rio: "+dono);
				System.out.println("Tipo: "+tipo);
				System.out.println("Saldo atual: "+saldo);
			}
			
			void abrirConta (boolean abertura)
			{
				if (abertura == true) 
				{
					System.out.println("Conta dispon�vel para visualizar saldo");
				} else
					System.out.println("Confirme como verdadeira para usar conta");
			}
			
			void sacar (double saque) 
			{
				saldo -= saque;
				System.out.printf("Conforme valor de saque de %.2f, valor do saldo atual �: %.2f", saque, saldo);
			}
}
