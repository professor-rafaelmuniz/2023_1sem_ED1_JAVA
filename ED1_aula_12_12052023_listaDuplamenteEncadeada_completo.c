#include <stdio.h>
#include <stdlib.h>

typedef struct no {
	struct no *ant;
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
	while (aux->prox != NULL){
		printf(" %i ", aux->valor);
		aux = aux->prox;
	} 
	printf(" %i ", aux->valor);
	printf("\nDE TRAS PARA FRENTE\n");
	while(aux->ant != NULL){
		printf(" %i ", aux->valor);
		aux = aux->ant;
	}
	printf(" %i ", aux->valor);
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

void removerNo(Lista *l){
	int removerNo;
	No *aux, *ant;
	ant = aux = l->inicio;
	printf("Digite o valor do NO:");
	scanf("%i", &removerNo);
	if (aux == NULL){
		printf("LISTA VAZIA");
	}else{
		if (aux->valor == removerNo){
			// PRIMEIRO ELEMENTO
			l->inicio = aux->prox;
			if (aux->prox != NULL){
				ant = aux->prox;
				ant->ant = NULL;
			}
			free(aux);

		}else{
			while(aux != NULL){
				if (aux->valor == removerNo){
					// ENCONTRAMOS
					if(aux->prox == NULL){
						// REMOVER ULTIMO
						ant->prox = NULL;
						free(aux);
						break;
					}else{
						// REMOVER NO MEIO
						ant->prox = aux->prox;
						No *p;
						p = aux->prox;
						p->ant = aux->ant;
						free(aux);
						break;	
					}
				}else{
					ant = aux;
					aux = aux->prox;
				//	printf("ANT: %i - AUX: %i", ant->valor, aux->valor);
				}
			}
		}
	}
	
	
}

void inserirNoOrdenado(Lista *l){
	No *aux = l->inicio;
	
	No *novoNo = malloc(sizeof(No));
	printf("Digite o valor do no:");
	scanf("%i", &novoNo->valor);
	
	if (aux == NULL){
		// Lista Vazia
		novoNo->ant  = NULL;
		novoNo->prox = NULL;
		l->inicio = novoNo;
	}else{
		// Inserir no inicio da lista
		if(novoNo->valor < aux->valor){
			novoNo->prox = l->inicio;
			novoNo->ant = NULL;
			aux->ant = novoNo;
			l->inicio = novoNo;
		}else{
			while(aux->prox != NULL && novoNo->valor > aux->prox->valor){
				aux = aux->prox;
			}
				if (aux->prox == NULL){
					// Ultimo elemento
					novoNo->prox = NULL;
					novoNo->ant = aux;
					aux->prox = novoNo;	
				}else{
					novoNo->prox = aux->prox;
					novoNo->ant = aux->ant;//Erro só aux
					aux->ant = novoNo; // Não pode
					// Alterar ant do prox do aux
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
	imprimirLista(lista);
	printf("\nREMOVER:");
	removerNo(&lista);
	//inserirNoOrdenado(&lista);
	imprimirLista(lista);
	
	//buscarNo(lista);
}










