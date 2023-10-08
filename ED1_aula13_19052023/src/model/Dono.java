package model;

import javax.swing.JOptionPane;

public class Dono {
	String nome;
	String cpf;
	Cachorro cao;
	
	Dono(Cachorro cao){
		
		this.nome = JOptionPane.showInputDialog("Digite o nome:");
		this.cpf = JOptionPane.showInputDialog("Digite o CPF:");
		this.cao = cao;
	}

	
	
	
	
	@Override
	public String toString() {
		return "Dono [nome=" + nome + ", cpf=" + cpf + ", cao=" + cao + "]";
	}
	
	
}
