#include <stdio.h>
#include <stdlib.h>

typedef struct no {
	int valor;
	struct no *prox;	
}No;

typedef struct{
	No *inicio;
}Lista;

void imprimirLista(Lista l){
	No *aux = l.inicio;
	int cont;
	printf("IMPRIMIR A LISTA : ");
	while (aux != NULL){
		printf(" %i ", aux->valor);
		aux = aux->prox;
	} 
}

void buscarNo(Lista l){
	No *aux = l.inicio;
	int valorBuscado;
	printf("\nDigite o valor a ser buscado:");
	scanf("%i", &valorBuscado);
	int flag = 0;
	while( aux != NULL ){
		if (aux->valor == valorBuscado){
			printf("\nACHOU");
			flag = 1;
			break;
		}else{
			aux = aux->prox;
		}
	}
	if(flag == 0){
		printf("\nNAO ACHOU");
	}
	
}

void inserirNoOrdenado(Lista *l){
	No *aux = l->inicio;
	
	No *novoNo = malloc(sizeof(No));
	printf("Digite o valor do no:");
	scanf("%i", &novoNo->valor);
	
	if (aux == NULL){
		// Lista Vazia
		novoNo->prox = NULL;
		l->inicio = novoNo;
	}else{
		// Inserir no inicio da lista
		if(novoNo->valor < aux->valor){
			novoNo->prox = l->inicio;
			l->inicio = novoNo;
		}else{
			while(aux->prox != NULL && novoNo->valor > aux->prox->valor){
				aux = aux->prox;
			}
				if (aux->prox == NULL){
					// Ultimo elemento
					novoNo->prox = NULL;
					aux->prox = novoNo;	
				}else{
					novoNo->prox = aux->prox;
					aux->prox = novoNo;
				}
				
			
		}
	}
}

void main(){
	
	/*
	No *no1, *no2, *no3;
	Lista lista;
	no1 = malloc(sizeof(No));
	no2 = malloc(sizeof(No));
	no3 = malloc(sizeof(No));
	printf("Digite o valor do no: ");
	scanf("%i", &no1->valor);
	printf("Digite o valor do no2: ");
	scanf("%i", &no2->valor);
	printf("Digite o valor do no3: ");
	scanf("%i", &no3->valor);
	
	no1->prox = no3;
	no3->prox = no2;
	no2->prox = NULL;
	*/
	Lista lista;
	lista.inicio = NULL;
	inserirNoOrdenado(&lista);
	inserirNoOrdenado(&lista);
	inserirNoOrdenado(&lista);
	inserirNoOrdenado(&lista);
	imprimirLista(lista);
	
	//buscarNo(lista);
}










