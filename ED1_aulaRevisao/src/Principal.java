import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Produto biscoito = new Produto();
		String xxx = JOptionPane.showInputDialog("Qual o nome     ?");
		biscoito.setNome("Bono - Doce de Leite");
		// Integer.parseInt(JOP,.,....)
		// char  JOpxxxxxxxx. charAt(0);.
		
		biscoito.setPreco(3.50f);
		biscoito.setQtdEstoque(10);
		
		Produto tapioca = new Produto("Tapioca X", 10.0f, 100);
		Mercado russel = new Mercado();
		russel.setAberto('S');
		russel.setAceitaAlimentacao(false);
		russel.setNomeMercado("Russel");
		russel.inserirProduto(tapioca);
		russel.inserirProduto(biscoito);
		
		JOptionPane.showMessageDialog(null, russel);

	}

}
