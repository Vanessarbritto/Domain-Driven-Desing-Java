package exercicios_logica;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, d, media, media_final;
		
		System.out.print("Digite a nota a: ");
		a = scanner.nextInt();			  

		System.out.print("Digite a nota b: ");
		b = scanner.nextInt();
		
		System.out.print("Digite a nota c: ");
		c = scanner.nextInt();
		
		System.out.print("Digite a nota d: ");
		d = scanner.nextInt();
		  
		media_final = (a + b + c + d) / 4;
		
		System.out.printf("sua media final e: %s.", media_final);
		
	}

}
