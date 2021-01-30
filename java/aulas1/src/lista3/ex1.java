package lista3;

import java.util.Scanner;

public class ex1 {
			public static void main(String[] args) {
				 Scanner leia = new Scanner(System.in);
				 double divisao = 11, resultado = 0; 
				 
				 for(int i= 1000; i<=1999; i++) 
				 {
					 	resultado = i%divisao;
					 	
					 	
					 	if (resultado == 5) {
					 		System.out.println("Conforme número "+i+", valor resto obtido é: "+resultado);
					 	} 
					 	
					 	
					 	
					 
				 }
						 	
			}
}
