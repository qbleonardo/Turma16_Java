package lista4;

import java.util.Scanner;

public class ex1 {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			double [] pontos = new double [5];
			double maiorValor = 0;
			
			for(int i = 0; i<=4; i++)
			{
					System.out.printf("Digite o "+(i+1)+ "° valor:");
					pontos[i] = leia.nextDouble();
					if (maiorValor < pontos[i]) {
							maiorValor = pontos[i];
					}
							
			}
			
				System.out.printf("O vetor formado foi { "+pontos[0]+" , "+ pontos[1]+" , "+pontos[2]+" , "+pontos[3]+" , "+ pontos[4]+ "  }");
				System.out.printf("\nA maior pontuação  é: "+ maiorValor);
			
			
			
			
		}
}
