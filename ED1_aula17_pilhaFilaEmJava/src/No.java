
public class No {
	private int valor;
	private No prox;
	
	No(int valor){
		this.valor = valor;
		this.prox = null;
	}
	
	public void adicionarNovoNoFinal(No novoNo) {
		No noAtual = this;
		while(noAtual.prox  != null) {
			noAtual = noAtual.prox;
		}
			noAtual.prox = novoNo;
	}

	@Override
	public String toString() {
		return "No [valor=" + valor + ", prox=" + prox + "]";
	}
	
	
	
}
