package poo;

public class ProdutoEletronico {
		String cor;
		String modelo;
		boolean ligado;
		int volume;
		public ProdutoEletronico(String cor, String modelo, boolean ligado) {
			super();
			this.cor = cor;
			this.modelo = modelo;
			this.ligado = ligado;
		}
		
		void ligar ()
		{
			this.ligado = true;
			System.out.println("O rádio está ligado!");
		}
		
		void desligar ()
		{
			this.ligado = false;
		}
		
		void altura (int quantidade)
		{
			this.volume+=quantidade;
			System.out.println("O volume atual é: "+volume);
		}
		
		void status () {
			System.out.println("Modelo: "+this.modelo);
			System.out.println("Cor: "+this.cor);
			System.out.println("Está ligado: "+this.ligado);
			System.out.println("Volume iniciado: "+this.volume);
		}
		
}		
