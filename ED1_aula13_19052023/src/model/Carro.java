package model;

import java.util.Scanner;

public class Carro {
	String modelo;
	String placa;
	int anoFabricacao;
	String chassi;
	String cor;
	float peso;
	Float km;
	boolean rebaixado;
	boolean eletrico;
	
	Carro(String modelo){
		this.modelo = modelo;
	}
	
	Carro(){
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o ano de fabricação: ");
		this.anoFabricacao = input.nextInt();
		System.out.println("Digite o modelo: ");
		this.modelo = input.next();
		System.out.println("Digite a placa: ");
		this.placa = input.next();
		System.out.println("Digite o peso:");
		this.peso = input.nextFloat();
		System.out.println("Digite o chassi:");
		this.chassi = input.next();
		System.out.println("Digite a cor:");
		this.cor = input.next();
		System.out.println("Rebaixado ?");
		this.rebaixado = input.nextBoolean();
	}
	
	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", placa=" + placa + ", anoFabricacao=" + anoFabricacao + ", chassi="
				+ chassi + ", cor=" + cor + ", peso=" + peso + ", km=" + km + ", rebaixado=" + rebaixado + ", eletrico="
				+ eletrico + "]";
	}
	
	
	
	
	
	
}
