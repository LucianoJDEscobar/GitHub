#include<stdio.h>

// Ponteiros, fun��es e vetores

int somarVetor(int vetor[], const int n){
    
    int soma = 0;
    int *p;
    int *const finalVetor = vetor + n;
    
    //
    for(p = vetor; p < finalVetor; p++){
        soma += *p;
    }
    
    return soma;
}

int main (void){
    
    int somarVetor(int vetor[], const int n);
    int vetor[10] = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
    
    printf("A soma do vetor �: %i", somarVetor(vetor, 10));
    
    return 0;
}