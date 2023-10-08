import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Disciplina {
	private String nome;
	private String sala;
	private int codigo;
	private Professor professor;
	private ArrayList<Aluno> listaAlunos; 
	
	
	Disciplina(){
		
	}
	
	
	public void adicionarListaDeAlunos(ArrayList<Aluno> lista) {
		this.listaAlunos = lista;
	}


	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", sala=" + sala + ", codigo=" + codigo + ", professor=" + professor
				+ ", listaAlunos=" + listaAlunos + "]";
	}


	public void imprimirListaAlunos() {
		for (Aluno aluno : listaAlunos) {
			JOptionPane.showMessageDialog(null, aluno);
		}
	}
	
	public void inserirNovoAluno(Aluno aluno) {
		this.listaAlunos.add(aluno);
	}
	
	
	
	
}
