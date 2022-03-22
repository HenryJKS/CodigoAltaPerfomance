package teste;

import tipoPilha.TipoPilhaInt;

public class MainTeste {

	public static void main(String[] args) {

		TipoPilhaInt pilha = new TipoPilhaInt();
		pilha.init();
		
		pilha.push(10);
		pilha.push(12);
		pilha.push(33);
		pilha.push(44);
		pilha.push(55);
		pilha.push(66);
		pilha.push(77);
		
		if (!pilha.isEmpty())
			System.out.println("\t Valor do dado que está no topo da pilha: " + pilha.top());
		
		pilha.esvazia();
		}
	
	
	
	
	
	
	
	
	

}
