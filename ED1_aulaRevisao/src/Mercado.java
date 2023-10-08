import java.util.ArrayList;

public class Mercado {
	private String nomeMercado;
	private String endereco;
	private int qtdFuncionarios;
	private boolean aceitaAlimentacao;
	private char aberto;// S ou N
	private ArrayList<Produto> listaProdutos;
	
	
	Mercado(){
		listaProdutos = new ArrayList<Produto>();
	}
	
	public void inserirProduto(Produto produto) {
		listaProdutos.add(produto);
	}

	@Override
	public String toString() {
		return "Mercado [nomeMercado=" + nomeMercado + ", endereco=" + endereco + ", qtdFuncionarios=" + qtdFuncionarios
				+ ", aceitaAlimentacao=" + aceitaAlimentacao + ", aberto=" + aberto + ", listaProdutos=" + listaProdutos
				+ "]";
	}

	public String getNomeMercado() {
		return nomeMercado;
	}

	public void setNomeMercado(String nomeMercado) {
		this.nomeMercado = nomeMercado;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public boolean isAceitaAlimentacao() {
		return aceitaAlimentacao;
	}

	public void setAceitaAlimentacao(boolean aceitaAlimentacao) {
		this.aceitaAlimentacao = aceitaAlimentacao;
	}

	public char getAberto() {
		return aberto;
	}

	public void setAberto(char aberto) {
		this.aberto = aberto;
	}

	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	
	
}
