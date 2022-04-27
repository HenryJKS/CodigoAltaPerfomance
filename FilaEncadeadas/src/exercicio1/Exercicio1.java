package exercicio1;

import java.util.Scanner;

import filas.FilaInt;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner le = new Scanner(System.in);
		FilaInt fila = new FilaInt();

		fila.init();
		System.out.println("Digite um valor positivo ou " +
		"negativo para sair: ");
		int valor = le.nextInt();
		
		while(valor >= 0) {
			//insere na fila valor digitado
		fila.enqueue(valor);
		System.out.println("Digite um valor positivo ou " +
		"negativo para sair: ");	
		valor = le.nextInt();
		}
	
		while(!fila.isEmpty())
			System.out.println("Valor retirado na fila: " + fila.dequeue());
		le.close();
	}

}
