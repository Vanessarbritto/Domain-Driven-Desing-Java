package exercicios_logica;

import java.util.Scanner;

/* 1 - Entrar via teclado com a base e a altura 
 * de um retngulo, calcular e exibir sua area
 */

public class Ex_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.print("Digite a base do retangulo: ");
		base = scanner.nextDouble();
		
		System.out.print("Digite a altura do retangulo: " );
		altura = scanner.nextDouble();
		
		area = base * altura;
	
		System.out.printf("O valor da area e: %s.", area);  
		
		scanner.close();
	}

}
