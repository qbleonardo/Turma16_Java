package heranca;

import heranca.Empregador;
public class EmpregadorTeste {
			public static void main(String[] args) {
				Empregador Emprega1 = new Empregador("Luiz", "Av. Pra quem sabe, 647", "8563-5417", 88, 1500, 15);
				
				
				System.out.println("Nome: "+Emprega1.getNome());
				System.out.println("Endereço: "+Emprega1.getEndereco());
				System.out.println("Telefone: "+Emprega1.getTelefone());
				System.out.println("Código de setor: "+Emprega1.getCodigoSetor());
				System.out.println("Salário: "+Emprega1.getSalarioBase());
				System.out.println("Imposto: "+Emprega1.getImposto());
				System.out.println("Cálculo final do sálario: "+Emprega1.calcularSalario());
			}
}
