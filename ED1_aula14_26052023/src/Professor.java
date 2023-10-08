
public class Professor {
	private String nome;
	private String area;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	Professor(){
		
	}

	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", area=" + area + "]";
	}

	
	
}
