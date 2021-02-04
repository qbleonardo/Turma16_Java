package heranca;

import heranca.Fornecedor;
public class FornecedorTeste {
	
		public static void main(String[] args) {
			Fornecedor forne1 = new Fornecedor("Erivelton", "Rua dos Gaspar, 525", "4002-8922", 600, 150);
			
				
			System.out.println("Nome: " +forne1.getNome());
			System.out.println("Endereço: "+forne1.getEndereco());
			System.out.println("Telefone: "+forne1.getTelefone());
			System.out.println("Valor de crédito: "+forne1.getValorCredito());
			System.out.println("Valor da divida: "+forne1.getValorDivida());
			System.out.println("Resultado de saldo final: "+forne1.obterSaldo());
	
			
			
		}

}
