package lista3;

import java.util.Scanner;

public class ex4 {
			public static void main(String[] args) {
				Scanner leia = new Scanner(System.in);
				int p = 0, idade, sexo, opcao, contador = 0, contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0;
				
				System.out.println("Pessoa n�mero: ");
				p = leia.nextInt();
				System.out.println("Digite a idade: ");
				idade = leia.nextInt();
				System.out.println("Digite o sexo:\n 1- Feminino\n 2-Masculino\n 3-Outros");
				sexo = leia.nextInt();
				System.out.println("Digite a caracteristica da pessoa: \n 1- Calma \n 2-Nervosa \n 3-Agressiva");
				opcao = leia.nextInt();
				
				
				while (p!=150) {
						 if (sexo == 1 && opcao == 2) {
								contador1++;
						} else if (sexo == 2 && opcao == 3) {
								contador2++;							
						} else if (sexo == 3 && opcao == 1) {
								contador++;
								contador3++;
						} else if (idade>40 && opcao == 2) {
								contador4++;
						} else if (idade<18 && opcao == 1) {
								contador++;
								contador5++;
						}
						
						
						System.out.println("Pessoa n�mero: ");
						p = leia.nextInt();
						System.out.println("Digite a idade: ");
						idade = leia.nextInt();
						System.out.println("Digite o sexo:\n 1- Feminino\n 2-Masculino\n 3-Outros");
						sexo = leia.nextInt();
						System.out.println("Digite a caracteristica da pessoa: \n 1- Calma \n 2-Nervosa \n 3-Agressiva");
						opcao = leia.nextInt();
				}
						System.out.println("N�mero total de pessoas calmas s�o: "+contador);
						System.out.println("N�mero total de mulheres nervosas s�o: "+contador1);
						System.out.println("N�mero total de homens agressivos s�o: "+contador2);
						System.out.println("N�mero total de outros calmos s�o: "+contador3);
						System.out.println("N�mero total de pessoas nervosas acima dos 40 anos s�o: "+contador4);
						System.out.println("N�mero total de pessoas calmas com menos de 18 anos s�o: "+contador5);
						
			}
}
