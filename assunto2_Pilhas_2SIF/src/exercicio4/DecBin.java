package exercicio4;

import java.util.Scanner;

import tipoPilha.TipoPilhaInt;

public class DecBin {

	public static void main(String[] args) {

		Scanner le = new Scanner(System.in);
		TipoPilhaInt pilha = new TipoPilhaInt();
		pilha.init();
		int decimal, resto;
		
		System.out.print("Informe valor em decimal: ");
		decimal = le.nextInt();
		
		while (decimal != 0) {
			resto = decimal % 2;
			pilha.push(resto);
			decimal = decimal / 2;
		}
		System.out.print("Valor em binário: ");
		pilha.esvazia();
		le.close();

	}


	
	
	
	
	
	
	
	
	
	
	
	
}
