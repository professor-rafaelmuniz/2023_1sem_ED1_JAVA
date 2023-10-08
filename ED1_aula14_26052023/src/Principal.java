import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno a1 = new Aluno ("João", "BP123");
		Professor p1 = new Professor();
		p1.area = "Informática";
		p1.nome = "Pedro";
		
		Aluno a2 = new Aluno ("Rafael", "BP321");
		Aluno a3 = new Aluno ("Maria", "BP456");
		
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		
		Disciplina d1 = new Disciplina();
		d1.codigo = 123;
		d1.sala = "A401";
		d1.nome = "Estrutura de dados";
		d1.professor = p1;
		
		d1.adicionarListaDeAlunos(lista);
		JOptionPane.showMessageDialog(null, d1);
		
		Aluno jose = new Aluno("José", "BP555");
		d1.inserirNovoAluno(jose);
		d1.imprimirListaAlunos();
		
		
		Aluno rafael = new Aluno();
		rafael.setIdade(10);
		rafael.setIdade(20);
		JOptionPane.showMessageDialog(null, rafael.getIdade());
		
	
	}

}
