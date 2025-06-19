package exercicios_logica;

import java.util.Scanner;

/* 3 - A partir dos valores da base e altura 
 * de um triangulo, calcular e exibir sua area
 */

public class Ex_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int base;
		double altura, area;
		
		System.out.print("Digite a base do triangulo: ");
		base = scanner.nextInt();
		
		System.out.print("Digite a altua do triangulo: ");
		altura = scanner.nextDouble();
		
		area = base * altura / 2;
		
		System.out.printf("O valor da area e: %s", area);  
	}

}
