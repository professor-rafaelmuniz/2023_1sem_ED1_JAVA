import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pilha {
	private ArrayList<Integer> pilha;
	
	Pilha(){
		pilha = new ArrayList<Integer>();
	}
	public void empilhar(Integer valor) {
		pilha.add(valor);
	}
	public void desempilhar() {
		if (!pilha.isEmpty()) {
			pilha.remove(pilha.size()-1);
		}else {
			JOptionPane.showMessageDialog(null, "Pilha Vazia");
		}
	}
	public Integer retornarTopo() {
		return pilha.get(pilha.size()-1);
	}
	
	@Override
	public String toString() {
		return "Pilha [pilha=" + pilha + "]";
	}
	
	
	
	
	
}
