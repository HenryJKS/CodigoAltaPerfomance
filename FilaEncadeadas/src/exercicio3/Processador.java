package exercicio3;

import java.util.Scanner;

import filas.FilaInt;

public class Processador {

	public static void main(String[] args) {
		
		Scanner le = new Scanner(System.in);
		FilaInt filap = new FilaInt();
		
		filap.init();
		
		int op;
		
		do {
			System.out.println("1- Coloque um processo: ");
			System.out.println("2- Execute o processo: ");
			System.out.println("3- Finalizando o programa ");
			op = le.nextInt();
			switch (op) {
			
			case 1: 
				System.out.println("Informe o pid: ");
				int pid = le.nextInt();
				filap.enqueue(pid);
			    break;
			    
			case 2:
				if(!filap.isEmpty()) {
				pid = filap.dequeue();
				System.out.println("Processo " + pid + " está sendo executado");	
				System.out.println("Processo foi realizado? (1- Sim/2- Não) ");
				int resp = le.nextInt();
				if (resp == 2)
					filap.enqueue(pid);
				else
					System.out.println("Processor " + pid + " foi realizado");
				}
				break;
				
			case 3:
				if(!filap.isEmpty()) {
				System.out.println("Há processo na fila em execução.");
				System.out.println("Deseja encerrar mesmo assim? (1- Sim/ 2- Não)");
				int resp = le.nextInt();
				if (resp == 1) {
					while(!filap.isEmpty())
						System.out.println("Encerrando a execução " + filap.dequeue());
					System.out.println("Shutdown...");
				}
				else 
				op = 0;
					
				}else
					System.out.println("Shutdown...");
				break;
				default: 
					System.out.println("Processo inválido!!! ");
			}
		} while (op != 3);
		
		

	}

}
