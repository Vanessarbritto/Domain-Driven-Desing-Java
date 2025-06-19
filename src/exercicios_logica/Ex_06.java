package exercicios_logica;

import java.util.Scanner;

public class Ex_06 {
	
	/* 6- Entrar via teclado com o valor da cotação do dólar
	* e uma certa quantidade de dólares. Calcular e exibir o valor 
	* correspondente em Reais (R$)
	*/

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double cotação, quantidade, valorEmReais;
		
		System.out.print("digite a cotação do dolar:");
		cotação = scanner.nextDouble();
		
		System.out.print("digite a quantidade de dolares:");
		quantidade = scanner.nextDouble();
		
	    valorEmReais = cotação * quantidade;
	    
	    System.out.printf("valor em reais: R$ %s.",valorEmReais);
		
		

	}

}
