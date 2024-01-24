#include <stdio.h>

// Ponteiros e vetores

int main(void){

// Declara��o padr�o de variavel e ponteiro
int y = 10;
int *ponte = &y;

// Declara��o de vetor e ponteiro para este vetor, neste caso ele aponta autom�ticamente 
// para o primeiro indice do vetor '0'
int vetor[3] = {1, 2, 3};
int *pont = vetor;

// Declara��o de vetor e ponteiro para este vetor, neste caso ele aponta manualmente para
// o indice '1' do vetor 'vet'
int vet[3] = {1, 2, 3};
int *p = &vet[1];

printf("%i\n", *pont);
printf("%i\n", *p);

getchar();
return 0;
}