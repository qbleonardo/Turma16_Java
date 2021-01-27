package aulas;

import java.util.Scanner;

public class ex6 {
	 	public static void main(String[] args) {
			
	 		Scanner leia = new Scanner(System.in);
	 		double x1, x2, y1, y2, distancia, resultado;
	 		
	 	   System.out.println("Digite o valor de x1: ");
	 	   x1 = leia.nextInt();
	 	  System.out.println("Digite o valor de x2: ");
	 	   x2 = leia.nextInt();
	 	  System.out.println("Digite o valor de y1: ");
	 	   y1 = leia.nextInt();
	 	  System.out.println("Digite o valor de y2: ");
	 	   y2 = leia.nextInt();
	 	   
	 	   distancia = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
	 	   
	 	   
	 	   System.out.println("A distância é: "+distancia);
		}

}
