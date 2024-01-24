#include <stdio.h>
#include <stdlib.h>

int main(void){
    
    int vet[3] = {10, 20, 30};
    int *p = vet;
    // Impress�o do valor do ponteiro
    printf("%i\n", *p);
    // '%p' � a forma correta de impress�o do endere�o de mem�ria apontado
    printf("\n%p", p);
    // '%i' n�o � a forma correta de impress�o do endere�o de mem�ria apontado
    //printf("\n%i", p);
    // Impress�o do endere�o de mem�ria com 4Bytes ap�s vet[0]
    p = &vet[1];
    printf("\n%p", p);
    // Impress�o do endere�o de mem�ria com 4Bytes ap�s vet[1]
    p = &vet[2];
    printf("\n%p\n", p);
    
    printf("\n--------AQUI MUDOU O PROGRAMA----------\n");
    
    p = &vet[0];
    
    // Imprimindo o valor do endere�o de mem�ria *p
    printf("\n%i", *p);
    
    // Mudando para o pr�ximo �ndice com incremento de ponteiro
    ++p;
    ++p;
    
    // Imprimindo o valor do endere�o de mem�ria *p
    printf("\n%i", *p);
    
    p = &vet[0];    
    // Alterando o valor do vetor �ndice 1 atrav�s de ponteiro
    *(p + 1) = 40;
    
    // Imprimindo o valor do vetor 'vet' com �ndice '1' alterado
    printf("\n%i", vet[1]);
    
    return 0;
}