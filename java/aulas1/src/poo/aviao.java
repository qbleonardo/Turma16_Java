package poo;

public class aviao {
		public String modelo;
		public String cor;
		public boolean velocidade;
		public boolean repouso; 
		
		void status () {
			System.out.println("Modelo: "+this.cor);
			System.out.println("Cor do avião: "+this.cor);
			System.out.println("Sistema está ligado: "+this.repouso);
			System.out.println("O avião poderá decolar?: "+this.velocidade);
		}
		void ligar()
		{
			
			if (this.repouso == true) {
				System.out.println("Sistema de partida iniciado");
				
				
			}else {
				System.out.println("O avião está em repouso");
			}
		}
		
		void decolar() 
		{
			if (this.velocidade == true) {
				System.out.println("Conforme sistema iniciado, velocidade tomada para partida do avião.");
			} else {
				System.out.println("Aguardando inicialização de sistema");
			}
		}
		
		
		
		
		
}
