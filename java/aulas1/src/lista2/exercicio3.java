package lista2;

import java.util.Scanner;

public class exercicio3 {
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			int idade; 
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			if (idade>=10 && idade<=14) {
				System.out.println("Voc� pertence a categoria infantil");
				
			} else if (idade<10) {
				System.out.println("Voc� n�o pertence a nenhuma categoria v�lida");
				
			} else if (idade>=15 && idade<=17) {
				System.out.println("Voc� pertence a categoria juvenil");
			
			} else if (idade>=18 && idade<=25) {
				System.out.println("Voc� pertence a categoria adulto");
			} else if (idade>25) {
				System.out.println("Voc� n�o pertence a nenhuma categoria");
			}
		}

}
