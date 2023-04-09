#include <stdio.h>
#define TAM 4
int main(){
	
	int cont;
	float tempoVolta, melhorVolta, totalVoltas=0;
	int voltaMaisRapida;
	for (cont = 0; cont < TAM; cont++){
		do{
			printf("Digite o tempo da volta:");
			scanf("%f", &tempoVolta);
		}while(tempoVolta <= 0.0);
		
		
		totalVoltas = totalVoltas + tempoVolta;
		if (cont == 0){
			melhorVolta	= tempoVolta;
			voltaMaisRapida = 1;
		}else{
			if (tempoVolta < melhorVolta){
				melhorVolta	= tempoVolta;
				voltaMaisRapida = cont + 1;
			}
		}
	}
	printf("Melhor tempo %f ocorreu na volta %i.",melhorVolta, voltaMaisRapida );
	printf("\n Media das voltas: %f", totalVoltas/TAM);
	
	return 0;
}
