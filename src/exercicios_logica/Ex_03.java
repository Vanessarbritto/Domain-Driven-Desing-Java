package exercicios_logica;

import java.util.Scanner;

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
