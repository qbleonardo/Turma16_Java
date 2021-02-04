package poo;

public class ContaBancariaTeste {
			public static void main(String[] args) {
				ContaBancaria itau = new ContaBancaria(854765, "Maruel", "Conta Corrente", 1000.00);
				
				itau.status();
				itau.abrirConta(true);
				itau.sacar(999);
				
			}
}
