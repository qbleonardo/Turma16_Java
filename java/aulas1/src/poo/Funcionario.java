package poo;

public class Funcionario {
		String nome;
		String cargo;
		double salario;
		
		public Funcionario(String nome, String cargo, double salario) {
			super();
			this.nome = nome;
			this.cargo = cargo;
			this.salario = salario;
		
		}
		void stauts()
		{
			System.out.println("Nome: "+nome);
			System.out.println("Cargo atual: "+cargo);
			System.out.println("Sal�rio atual: "+salario);			
		}
		
		void Entrada(int jornadaMensal)
		{
			double horaTrabalhada = salario / jornadaMensal;
			System.out.printf("Hora trabalhada � %.2f: ",horaTrabalhada);
		}
		
}
