#include <stdio.h>
#define TAM 4

int pilha[TAM], topo=0;

int cheia(){
	if(topo == TAM){
		return 1; 
	}else{
		return 0;
	}
}

void atual(){
	int pilhaVazia;
	pilhaVazia = vazia();
	if(pilhaVazia == 0){
		printf("\nPILHA VAZIA");
	}else{
		printf("\nELEMENTO DO TOPO: %i", pilha[topo-1]);	
	}
}

void empilha(){
	int pilhaCheia;
	pilhaCheia = cheia();
	if(pilhaCheia == 1){
		printf("\nPILHA CHEIA");
	}else{
		int valor;
		printf("\nDigite um numero: ");
		scanf("%i", &valor);
		pilha[topo] = valor;
		topo++;	
	}
	
}

void desempilha(){
	int pilhaVazia;
	pilhaVazia = vazia();
	if(pilhaVazia == 0){
		printf("\nPILHA VAZIA");
	}else{
		printf("\nDESEMPILHA\n");
		topo--;
	}
	
	
}

int vazia(){
	if(topo == 0){
		return 0;
	}else{
		return 1;
	}
}

void imprimir(){
	int cont;
	int pilhaVazia;
	pilhaVazia = vazia();
	if(pilhaVazia == 0){
		printf("\nPILHA VAZIA");
	}else{
		for(cont = 0; cont < topo; cont++){
			printf(" %i ", pilha[cont]);
		}
	}
}

int main(){



	empilha();
	//imprimir();
	//atual();
	empilha();
	//empilha();
	desempilha();
	empilha();
	imprimir();
	atual();
		
	return 0;
}
