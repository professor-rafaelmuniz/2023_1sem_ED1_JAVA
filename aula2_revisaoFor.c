#include <stdio.h>

int main(){
	int i;
	float altura, totalAltura = 0;
	for (i = 0; i < 8; i++){
		printf("Digite uma altura: ");
		scanf("%f", &altura);
		totalAltura = totalAltura + altura;
	}
	printf("Media final: %.2f", totalAltura/8);
	
	
	return 0;
}
