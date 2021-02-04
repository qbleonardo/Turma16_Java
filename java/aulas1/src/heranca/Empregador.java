package heranca;

public class Empregador extends Pessoa {
		private int codigoSetor;
		private int salarioBase;
		private double imposto;
		
		public Empregador(String nome, String endereco, String telefone, int codigoSetor, int salarioBase,
				int imposto) {
			super(nome, endereco, telefone);
			this.codigoSetor = codigoSetor;
			this.salarioBase = salarioBase;
			this.imposto = imposto;
		}

		public int getCodigoSetor() {
			return codigoSetor;
		}

		public void setCodigoSetor(int codigoSetor) {
			this.codigoSetor = codigoSetor;
		}

		public int getSalarioBase() {
			return salarioBase;
		}

		public void setSalarioBase(int salarioBase) {
			this.salarioBase = salarioBase;
		}

		public double getImposto() {
			return imposto;
		}

		public void setImposto(double imposto) {
			this.imposto = imposto;
		}
		
		public double calcularSalario() {
				return salarioBase + (imposto/100) * salarioBase;
		}

}
