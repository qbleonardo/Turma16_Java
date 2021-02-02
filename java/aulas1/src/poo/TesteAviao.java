package poo;

public class TesteAviao {
		public static void main(String[] args)
		{
			aviao AviaoTeste = new aviao();
			AviaoTeste.cor = "Branco";
			AviaoTeste.modelo = "AIRPLANE-003";
			AviaoTeste.repouso = true;
			AviaoTeste.velocidade = true;	
			AviaoTeste.status();
			
			
			AviaoTeste.ligar();
			AviaoTeste.decolar();
			
		}
}
