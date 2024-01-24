#include <stdio.h>

// Ponteiros e vetores

int main(void){

// Declaração padrão de variavel e ponteiro
int y = 10;
int *ponte = &y;

// Declaração de vetor e ponteiro para este vetor, neste caso ele aponta automáticamente 
// para o primeiro indice do vetor '0'
int vetor[3] = {1, 2, 3};
int *pont = vetor;

// Declaração de vetor e ponteiro para este vetor, neste caso ele aponta manualmente para
// o indice '1' do vetor 'vet'
int vet[3] = {1, 2, 3};
int *p = &vet[1];

printf("%i\n", *pont);
printf("%i\n", *p);

getchar();
return 0;
}