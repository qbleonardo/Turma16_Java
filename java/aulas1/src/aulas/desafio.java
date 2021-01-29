package aulas;

import java.util.Scanner;

public class desafio
{
	public static void main(String[] args) {
		

		Scanner leia = new Scanner (System.in); 
		double saldo=0, valor=0,valorLimite=0, valorLimite1=5000;
		int movimento,continua=0, limiteDecidir;
		String descricao;


			System.out.println("\t\t\t\t\tBem vindo à sua Conta Especial!"+"\n");
			System.out.println("Selecione o movimento [1/2]: \n 1 - Debito \n 2 - Crédito");
			movimento=leia.nextInt();
				if(movimento==1) 
				{
					System.out.println("Saldo atual em conta: "+saldo);
					System.out.println("Valor para saque: ");
					valor = leia.nextDouble();
					System.out.println("Descrição (Finalidade): "+"\n");
					descricao = leia.next();

					saldo=saldo-valor;
				if(saldo<0) 
					{
						System.out.println("Verificado em conta que saldo encontra-se negativo!");
						System.out.println("Deseja solicitar limite estudantil? \n 1 - Sim \n 2 - Não");
						limiteDecidir = leia.nextInt();

						if(limiteDecidir==1)
						{
							System.out.println("Digite um valor para o limite estudantil: ");
							valorLimite= leia.nextDouble();
							saldo=+valorLimite;
							valorLimite1=valorLimite1-valorLimite;
							System.out.println("Saldo atual em conta: "+saldo);
							System.out.println("Valor restante do limite estudantil para uso: "+valorLimite1);
						
						}
						else if(limiteDecidir==2)
						{
							System.out.println("Sessão encerrada");
							continua = leia.nextInt();
						}
						


				}
					
			} else if (movimento == 2) {
				System.out.println("Saldo atual em conta: "+saldo);
				System.out.println("Valor para saque: ");
				valor = leia.nextDouble();
				System.out.println("Descrição (Finalidade): "+"\n");
				descricao = leia.next();

				saldo=saldo-valor;
			} if(saldo<0)
			{
				System.out.println("Verificado em conta que saldo encontra-se negativo!");
				System.out.println("Deseja solicitar limite estudantil? \n 1 - Sim \n 2 - Não");
				limiteDecidir = leia.nextInt();

				if(limiteDecidir==1)
				{
					System.out.println("Digite um valor para o limite estudantil: ");
					valorLimite= leia.nextDouble();
					saldo=+valorLimite;
					valorLimite1=valorLimite1-valorLimite;
					System.out.println("Saldo atual em conta: "+saldo);
					System.out.println("Valor restante do limite estudantil para uso: "+valorLimite1);
				
				}
				else if(limiteDecidir==2)
				{
					System.out.println("Sessão encerrada");
					continua = leia.nextInt();
					
				}
							
				
				
			
	

			}
	}
}	