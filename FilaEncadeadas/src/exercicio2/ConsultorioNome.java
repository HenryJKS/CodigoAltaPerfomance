package exercicio2;

import java.util.Scanner;

import filas.FilaString;

public class ConsultorioNome {

	public static void main(String[] args) {
	
		Scanner le = new Scanner(System.in);
		FilaString filas = new FilaString();
		
		filas.init();
		//criar fila com nomes
		
		int op;
		do {
			System.out.println("1- Insere paciente na fila");
			System.out.println("2- Insere idade do paciente");
			System.out.println("3- Chama paciente para o atendimento");
			System.out.println("4- Encerra o atendimento do dia");
			System.out.println("   Opção:   ");
			op = le.nextInt();
			switch (op) {
			case 1:
				System.out.println("Nome do paciente: ");
				String nome = le.next();
				//insere paciente na fila
				filas.enqueue(nome);
				break;
			case 2:
				System.out.println("Idade do paciente: ");
				String idade = le.next();
				//insere a idade do paciente na fila
				filas.enqueue(idade);
			case 3:
				//retira o paciente da fila e apresenta seu nome
				if (!filas.isEmpty())
					System.out.println("Paciente sendo chamado para atendimento " + filas.dequeue());
				break;
			case 4:
				if(!filas.isEmpty()) {
					System.out.println("Há pacientes em espera ");
					op = 0;
				}
				break;
			default:
				System.out.println("Opção Inválida");
			}
		} while(op!= 4);
		le.close();
		System.out.println("Atendimento encerrado!");
	}

}
