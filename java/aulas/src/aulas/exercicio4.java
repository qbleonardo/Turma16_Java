package aulas;

import java.util.Scanner;

public class exercicio4 {
		   public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			int numero;
			double resultado;
			
			
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero%2==0) {
				
				resultado = Math.sqrt(numero);
				System.out.println("Número digitado é par e o valor da raiz quadrada é: "+resultado);
			} else   {
				
				resultado = numero * numero;
				System.out.println("Número digitado é impar e o valor elevado ao quadrado é: "+resultado);
			}
			
		}	
}
