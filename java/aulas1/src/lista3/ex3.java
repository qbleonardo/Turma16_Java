package lista3;

import java.util.Scanner;

public class ex3 {
			public static void main(String[] args) {
					Scanner leia = new Scanner(System.in);
					int idade, contador19 = 0, contador50 = 0; 
					
					System.out.println("Digite a sua idade: ");
					idade = leia.nextInt();
					
				while(idade>=-99) {
					
				
					 
					if (idade<=19) {
							contador19+=1;	 	
					} else if (idade>=50) {
							contador50+=1;		
					}										
					
					System.out.println("Digite a sua idade: ");
					idade = leia.nextInt();
					
					if(idade == -99) {
						break;
					}
				}
					System.out.println("Total de pessoas com menos de 19, são: "+contador19++);
					System.out.println("Total de pessoas com mais de 50, são: "+contador50++);
				
			}

}
