package poo;

public class aviao {
		public String modelo;
		public String cor;
		public boolean velocidade;
		public boolean repouso; 
		
		void status () {
			System.out.println("Modelo: "+this.cor);
			System.out.println("Cor do avi�o: "+this.cor);
			System.out.println("Sistema est� ligado: "+this.repouso);
			System.out.println("O avi�o poder� decolar?: "+this.velocidade);
		}
		void ligar()
		{
			
			if (this.repouso == true) {
				System.out.println("Sistema de partida iniciado");
				
				
			}else {
				System.out.println("O avi�o est� em repouso");
			}
		}
		
		void decolar() 
		{
			if (this.velocidade == true) {
				System.out.println("Conforme sistema iniciado, velocidade tomada para partida do avi�o.");
			} else {
				System.out.println("Aguardando inicializa��o de sistema");
			}
		}
		
		
		
		
		
}
