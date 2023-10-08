package model;

import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		System.out.print("Testando msg");
		
		// 
		int idade;
		float peso;
		char primeiraLetra;
		boolean temFilhos;
		String nome;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = input.next();
		System.out.print("Digite sua idade:");
		idade = input.nextInt();
		
		
		System.out.println("Seu nome é  "+ nome);
		
		
	}
}
