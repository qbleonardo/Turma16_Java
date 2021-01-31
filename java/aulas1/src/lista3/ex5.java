package lista3;

import java.util.Scanner;

public class ex5 {
			public static void main(String[] args) {
				Scanner leia = new Scanner(System.in);
				int n, soma = 0, acm = 0; 
				
				do {
					System.out.println("Digite um número: ");
					n = leia.nextInt();
					acm+=n;
					soma+=n;
				
				} while (n!=0); {
					System.out.println("A soma total dos números é: "+soma);
				}
			}
}
