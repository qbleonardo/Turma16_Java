package lista4;

import java.util.Random;

public class ex2 {
			public static void main(String[] args) {
					
					Random random = new Random();
					int [] lancamentos = new int [10];
					double somatoria = 0, media;
					int maiorValor = 0, contador = 0;
					
					
					for(int x=0;x<10;x++) 
					{
						lancamentos[x] = random.nextInt(6)+1;
						somatoria+=lancamentos[x];
						if (lancamentos[x]>=maiorValor) 
						{
							if (lancamentos[x] == maiorValor) {
								contador++;
							}
							else {
								contador=1;
							}
							maiorValor = lancamentos[x];
						}
					}
					for (int x=0;x<10;x++) {
						System.out.println("Lan�amentos do dado n�mero: "+(x+1)+" � igual a "+lancamentos[x]+"\n");
					}
							
					media = somatoria/10;
					System.out.println("A soma dos valores � "+somatoria+"\n");
					System.out.println("A m�dia aritm�tica � "+media+"\n");
					System.out.println("Maior valor informado foi "+maiorValor+" que aparece "+contador+" nos lan�amentos!");
					
					
			}
}
