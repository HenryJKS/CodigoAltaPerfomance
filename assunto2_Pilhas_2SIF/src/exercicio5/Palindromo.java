package exercicio5;

import java.util.Scanner;

import tipoPilha.TipoPilhaInt;

public class Palindromo {
	
	
	public static void main(String[] args ) {
		
		Scanner le = new Scanner(System.in);
		TipoPilhaInt pilha = new TipoPilhaInt();
		pilha.init();
		
		int numero[] =  new int[pilha.N];
		int inverso[] = new int[pilha.N];
		
		System.out.println("Digite valor de 0 a 9 ou -1 para encerrar: ");
		int digito = le.nextInt();		
		int n= 0;
		while (digito >= 0) {
			numero[n]=digito;
			n++;
			pilha.push(digito);
			
			
			System.out.println("Digite valor de 0 a 9 ou -1 para encerrar: ");
			digito = le.nextInt();			

			
		}
		
		int i=0;
		while(!pilha.isEmpty()) {
			inverso[i] = pilha.pop();
			i++;
		}
		
		boolean palindromo = true;
		for(i=0; i<n && palindromo; i++) {
			if (numero[i] != inverso[i])
				palindromo = false;
		}
		
		if (palindromo) 
		System.out.println("É Palindromo: ");
		else
		System.out.println("Não é Palindromo: ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
