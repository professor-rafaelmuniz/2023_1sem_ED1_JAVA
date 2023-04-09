#include <stdio.h>

int main(){
	int codigo = 10;
	printf("Digite o codigo:");
	scanf("%i", &codigo);
	
	if(codigo == 1){
		printf("Peixinho 1 - Segunda-feira 8h00");
	}else if (codigo == 2){
		printf("Peixinho 2 - Quarta-feira 8h00");	
	}else if (codigo == 3){	
		printf("Peixinho 3 - Sexta-feira 18h00");	
	}else if (codigo == 4){
		printf("Tubarao - Sabado 10h00 - 16h00");		
	}else{
		printf("Codigo invalido");
	}
	
	return 0;
}
