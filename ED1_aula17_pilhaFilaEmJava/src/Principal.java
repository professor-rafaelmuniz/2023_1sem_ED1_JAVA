import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		// PILHA MANUAL
		/*
		Pilha pilha = new Pilha();
		pilha.desempilhar();
		pilha.empilhar(10);
		pilha.empilhar(20);
		pilha.empilhar(30);
		JOptionPane.showMessageDialog(null, pilha);
		pilha.desempilhar();
		JOptionPane.showMessageDialog(null, pilha);
		JOptionPane.showMessageDialog(null, pilha.retornarTopo());
	
		// PILHA DO JAVA
		Stack pilha = new Stack();
		if (!pilha.empty()) {
			pilha.pop();
		}else {
			JOptionPane.showMessageDialog(null, "Pilha Vazia");
		}
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
	
		if (!pilha.empty()) {
			pilha.pop();
		}
		JOptionPane.showMessageDialog(null, pilha);
		*/
		/*
		// FILA MANUAL
		Fila fila = new Fila();
		fila.enfileirar(10);
		fila.enfileirar(20);
		fila.enfileirar(30);
		fila.retirarDaFila();
		fila.retirarDaFila();
		JOptionPane.showMessageDialog(null, fila);
		// FILA EM JAVA
		
		Queue<Integer> fila = new LinkedList<Integer>();
		fila.add(10);
		fila.add(20);
		fila.add(30);
		fila.poll();
		JOptionPane.showMessageDialog(null, fila);
		*/
		No no1 = new No(10);
		No no2 = new No(20);
		No no3 = new No(30);
		
		no1.adicionarNovoNoFinal(no2);
		no1.adicionarNovoNoFinal(no3);
		JOptionPane.showMessageDialog(null, no1);
		
	}

}
