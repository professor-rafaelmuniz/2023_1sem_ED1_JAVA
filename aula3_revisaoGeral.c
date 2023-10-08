#include <stdio.h>
# define TAM 4
int main(){
	int cont, numero, vetor[6]={0,0,0,0,0,0};
	for (cont =0; cont < TAM; cont++){
		do{
			printf("Digite um numero:");
			scanf("%i", &numero);
		}while((numero < 1) || (numero > 5));		
		
		vetor[numero]++;
		/*if (numero == 1){
			vetor[1]++;
		}else if (numero == 2){
			vetor[2]++;
		}else if (numero == 3){
			vetor[3]++;
		}else if(numero == 4){
			vetor[4]++;
		}else{
			vetor[5]++;
		}
		*/
		
	}
	int x;
	for (cont =1; cont<= TAM; cont++){
		printf("\n[%i] ", cont);
		for (x = 0; x < vetor[cont]; x++){
			printf("*");
		}
	}
	
	return 0;	
}