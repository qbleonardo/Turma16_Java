package lista4;

import java.util.Random;

public class ex4 {
			public static void main(String[] args) {
				Random sorteio = new Random();
				final int TAMANHO = 4;
				int cubo [][]= new int [TAMANHO][TAMANHO];
				int somatoria = 0;
				
				for (int linha = 0; linha <TAMANHO; linha++) 
				{
					for (int coluna = 0; coluna<TAMANHO; coluna++) 
					{
						 cubo[linha][coluna] = sorteio.nextInt(9)+1;
						 if (linha == coluna) 
						 {
							 somatoria += cubo[linha][coluna];
						 }
						 System.out.printf(cubo[linha][coluna]+ " ");
					}
					
					System.out.println("\n");
				}
				System.out.println("Somatoria da diagonal principal é: "+somatoria);
						
			}
	
	
}
