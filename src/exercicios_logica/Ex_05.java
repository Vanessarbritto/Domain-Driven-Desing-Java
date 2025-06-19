package exercicios_logica;

import java.util.Scanner;

/* 5- Entrar via teclado com o valor de uma temperatura em graus Celsius, 
  * calcular e exibir sua temperatura equivalente em Fahrenheit.
  */

public class Ex_05 {

	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  
	  double celcius, fahrenheit;
	  
	  System.out.print("Digite a temperatura em graus Celsius: ");
	  celcius = scanner.nextDouble();
	  
	  fahrenheit = (celcius * 1.8) + 32;
	  
	  System.out.printf("a temperatura em fahrenheit e: %s.", fahrenheit);
	}

}
