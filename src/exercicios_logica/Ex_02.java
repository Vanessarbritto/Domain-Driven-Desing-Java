package exercicios_logica;

import java.util.Scanner;

/* 2 - Calcular e exibir a area de um quadrado, 
 * a partir do valor de sua aresta que sera digitado
 */

public class Ex_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		
		double aresta, area;
		
		System.out.print("Digite o valor da aresta: ");
        aresta = scanner.nextDouble();
        
        area = aresta * aresta;
        
        System.out.printf("O valor da area é: %s.", area);  
	}

}
