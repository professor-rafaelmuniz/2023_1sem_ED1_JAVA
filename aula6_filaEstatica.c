//Fila Est tica
#include <stdio.h>
#define TAM 3
int fila[TAM], inicio, fim;

void inicializarFila(){
	inicio = fim = 0;
}

int verificaSeFilaCheia(){
	int retorno;
	if (fim == TAM){
		return 1;
	}else{
		return 0;
	}
}

void inserirNaFila(){
	int filaCheia;
	filaCheia = verificaSeFilaCheia();
	if (filaCheia == 1){
		printf("FILA CHEIA");
	}else{
		int valor;
		printf("Digite o valor desejado:");
		scanf("%i", &valor);
		fila[fim] = valor;
		fim++;
	}
}

void removerNaFila(){
	inicio++;
}

void imprimirFila(){
	int cont;
	for (cont = inicio; cont < fim; cont++){
		printf(" %i ", fila[cont]);
	}
}


int main(){
	
	inicializarFila();
	inserirNaFila();
	//inserirNaFila();
	//inserirNaFila();
	//inserirNaFila();
	//imprimirFila();
	removerNaFila();
	imprimirFila();
	
	
	
	
	
	
}