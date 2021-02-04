package poo;

public class ProdutoEletronicoTeste {
			public static void main(String[] args) {
				ProdutoEletronico radio = new ProdutoEletronico("Preto", "Sony 96", true);
				
				
				radio.status();
				radio.volume=10;
				
				radio.ligar();
				radio.altura(20);
			}
}
