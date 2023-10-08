package model;

import javax.swing.JOptionPane;

public class Cachorro {
	String nome;
	String raca;
	int idade;
	float peso;
	
	Cachorro(){
		this.nome = JOptionPane.showInputDialog(null,"Digite o nome do cachorro:");
		this.peso =  Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o peso do cachorro:"));
		this.idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do cachorro:"));
		this.raca = JOptionPane.showInputDialog("Digite a raça do cachorro: ");
	}
	
	
	@Override 
	public String toString() {
		return "Cachorro [nome=" + nome + ", raca=" + raca + ", idade=" + idade + ", peso=" + peso + "]";
	}

}
