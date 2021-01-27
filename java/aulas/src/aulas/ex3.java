package aulas;

import java.util.Scanner;

public class ex3 {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			int tempoDuracao, horas, minutos, segundos; 
			
			System.out.println("Escreva a duração do evento em segundos: ");
			tempoDuracao = leia.nextInt();
			
			horas = (tempoDuracao/3600);
			minutos = (tempoDuracao/60)%60;
			segundos = (tempoDuracao %3600)%60;
			
			System.out.println("Total em horas: "+horas);
			System.out.println("Total em minutos: "+minutos);
			System.out.println("Total em segundos: "+segundos);
			
			
			
		}
}
