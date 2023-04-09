#include <stdio.h>

int main(){
	int total = 0;
	int numero, qtdNumeros = 0;
	while(total < 50){
		qtdNumeros++;
		printf("Digite um numero: ");
		scanf("%i", &numero);
		total = total + numero;	
	}
	printf("Qtd: %i", qtdNumeros);
	if (qtdNumeros % 2 == 0){
		printf(" - PAR");
	}else{
			printf(" - IMPAR");
	}
	
	
}
