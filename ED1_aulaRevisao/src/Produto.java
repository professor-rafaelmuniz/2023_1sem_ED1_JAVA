
public class Produto {
	private String nome;
	private float preco;
	private int qtdEstoque;
	
	Produto(){
		System.out.println("Vazio");
	}
	

	public Produto(String nome, float preco, int qtdEstoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}
	// GETTERS AND SETTERS
	
	

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", qtdEstoque=" + qtdEstoque + "]";
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public int getQtdEstoque() {
		return qtdEstoque;
	}


	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	
	
	
	
}
