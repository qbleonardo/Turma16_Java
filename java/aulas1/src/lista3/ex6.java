package lista3;

import java.util.Scanner;

public class ex6 {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			double n, media = 0, acm = 0;
			
			do {
					System.out.println("Escreva um número: ");
					n = leia.nextDouble();
					acm+=n;
					
				if (n%3==0) {
					media = media+n;
				}
					
					
			}while (n!=0);
				System.out.println("Média total é: "+media);
			
		}
}
