package exercicios_logica;

import java.util.Scanner;

/* 7. Entrar via teclado com o valor de cinco produtos. Após as entradas, 
* digitar um valor referente ao pagamento da somatória destes valores. 
* Calcular e exibir o troco que deverá ser devolvido.
*/

public class Ex_07 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double p1, p2, p3, p4, p5;
		double total, valorpago, troco;
		
		System.out.print("digite o valor do prmeiro produto:R$");
		p1 = scanner.nextDouble();
				
		System.out.print("digite o valor do segundo produto:R$");
		p2 = scanner.nextDouble();
		
		System.out.print("digite o valor do terceiro produto:R$");
		p3 = scanner.nextDouble();
		
		System.out.print("digite o valor do quarto produto:R$");
		p4 = scanner.nextDouble();
		
		System.out.print("digite o valor do quinto produto:R$");
		p5 = scanner.nextDouble();
		
		total = p1 + p2 + p3 + p4 + p5;
		
		System.out.printf("total da compra: R$ %s.",total);
		
		System.out.print("\n digite o valor recebido: R$ ");
		valorpago = scanner.nextDouble();
		
		troco = valorpago - total;
		
		System.out.printf("o valor do troco e: R$ %s.",troco);
		
	}
	
}
	