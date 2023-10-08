import javax.swing.JOptionPane;

public class Aluno {
	private String nome;
	private String prontuario;
	private int idade;// Não pode idade < 14 anos
	
	Aluno(){
		
	}
	
	Aluno(String nome, String prontuario){
		this.nome = nome;
		this.prontuario = prontuario;
	}

	@Override
	public String toString() {
		return "\nAluno [nome=" + nome + ", prontuario=" + prontuario + "]";
	}
	
	// GET e SET
	
	public void setIdade(int idade) {
		if (idade >= 14) {
			this.idade = idade;
		}else {
			JOptionPane.showMessageDialog(null, "Idade inválida");
		}
	}
	
	public int getIdade() {
		return idade;
	}
	
}
