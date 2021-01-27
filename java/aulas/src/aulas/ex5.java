package aulas;

import java.util.Scanner;

public class ex5 {
		
	 public static void main(String[] args) {
		 	Scanner leia = new Scanner(System.in);
		 	double n1, n2, n3, mediaFinal;
		 	
		 	System.out.println("Digite a nota 1: ");
		 	n1 = leia.nextInt();
		 	System.out.println("Digite a nota 2: ");
		 	n2 = leia.nextInt();
		 	System.out.println("Digite a nota 3: ");
		 	n3 = leia.nextInt();
		 	
		 	
		 	mediaFinal = (n1*2 + n2*3 + n3*5) / 10;
		 	System.out.println("A média final é: "+mediaFinal);
		 	
	}
}
