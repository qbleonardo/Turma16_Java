package aulas;

import java.util.Scanner;

public class ex2 {
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			
			int idade, meses, anos, dias;
			
			System.out.println("Digite a quantidade total em dias: ");
			idade = ler.nextInt();
			
			anos = (idade/365);
			meses = (idade%365)/30;
			dias = (idade%365)%30;
			
			System.out.println("Total de anos: "+anos);
			System.out.println("Total em meses: "+meses);
			System.out.println("Total em dias: "+dias);
					
					
		}
}
