package aulas;

import java.util.Scanner;

public class ex1 {
	
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			int idade, anos, meses, diasTotais;
			
			System.out.println("Digite a idade: ");
			idade = ler.nextInt(); 
			System.out.println("Digite o mês: ");
			meses = ler.nextInt(); 
			System.out.println("Digite o ano: ");
			anos = ler.nextInt(); 
			
			diasTotais = (anos*365) + (meses*30) + idade;
			
			System.out.println("O resultado em dias é: "+diasTotais);
			
					
			
		}

}
