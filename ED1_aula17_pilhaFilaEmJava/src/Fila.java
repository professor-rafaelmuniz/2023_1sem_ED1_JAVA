import java.util.ArrayList;

public class Fila {
	private ArrayList<Integer> fila;
	
	Fila(){
		fila = new ArrayList<Integer>();
	}
	public void enfileirar(Integer valor) {
		fila.add(valor);
	}
	public void retirarDaFila() {
		fila.remove(0);
	}
	@Override
	public String toString() {
		return "Fila [fila=" + fila + "]";
	}
	
	
}
