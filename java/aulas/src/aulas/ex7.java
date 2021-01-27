package aulas;

import java.util.Scanner;

public class ex7 {
	 	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double a, b, c, d, e, f, x, y; 
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		System.out.println("Digite o valor de D: ");
		d = leia.nextInt();
		System.out.println("Digite o valor de E: ");
		e = leia.nextInt();
		System.out.println("Digite o valor de F: ");
		f = leia.nextInt();
			
		
		x = c*e - b*f / a*e - b*d;
		y = a*f - c*d / a*e-b*d;
		
		System.out.println("O valor de x é: "+x+"O valor de y é: "+y );
		
		
		}

}
