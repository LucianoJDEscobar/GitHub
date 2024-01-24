#include <stdio.h>
#include <stdlib.h>

int main(void){
    
    int vet[3] = {10, 20, 30};
    int *p = vet;
    // Impressão do valor do ponteiro
    printf("%i\n", *p);
    // '%p' é a forma correta de impressão do endereço de memória apontado
    printf("\n%p", p);
    // '%i' não é a forma correta de impressão do endereço de memória apontado
    //printf("\n%i", p);
    // Impressão do endereço de memória com 4Bytes após vet[0]
    p = &vet[1];
    printf("\n%p", p);
    // Impressão do endereço de memória com 4Bytes após vet[1]
    p = &vet[2];
    printf("\n%p\n", p);
    
    printf("\n--------AQUI MUDOU O PROGRAMA----------\n");
    
    p = &vet[0];
    
    // Imprimindo o valor do endereço de memória *p
    printf("\n%i", *p);
    
    // Mudando para o próximo índice com incremento de ponteiro
    ++p;
    ++p;
    
    // Imprimindo o valor do endereço de memória *p
    printf("\n%i", *p);
    
    p = &vet[0];    
    // Alterando o valor do vetor índice 1 através de ponteiro
    *(p + 1) = 40;
    
    // Imprimindo o valor do vetor 'vet' com índice '1' alterado
    printf("\n%i", vet[1]);
    
    return 0;
}