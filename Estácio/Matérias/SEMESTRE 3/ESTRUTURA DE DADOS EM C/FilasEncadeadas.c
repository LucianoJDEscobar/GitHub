#include <stdio.h>
#include <stdlib.h>
#include <>

typedef struct NO{
	int dado;
	NO *prox;
}NO;

typedef struct FILA{
	NO *ini;
	NO *fim;
}FILA;

void inicializaFila(FILA *f){
	f->ini = NULL;
	f->fim = NULL;
}

void enfileira(int dado, FILA *f){
	NO *ptr = (NO*) malloc(sizeof(NO));
	if(ptr == NULL){
		printf("Erro de alocação.\n");
		return;
	} else {
		ptr->dado = dado;
		ptr->prox = NULL;
		if(f->ini == NULL){
			f->ini = ptr;
		}
		f->fim = ptr;
	}
}

int desenfileira(FILA *f){
	NO *ptr = f->ini;
	int dado;
	if(ptr != NULL){
		f->inicio = ptr->prox;
		ptr->prox = NULL;
		dado = ptr->dado;
		free(ptr);
		if(f->ini == NULL){
			f->fim = NULL;
		}
	} else {
		printf("Fila vazia.\n");
		return 0;
	}
}

void imprimeFila(Fila *f){
	NO *ptr = f->ini;
	if(ptr != NULL){
		while(ptr != NULL){
			printf("%d ", ptr->dado);
			ptr = ptr->prox;
		}
	} else {
		printf("Fila vazia.\n");
		return;
	}
}

int main(){
	FILA *f1 = (FILA*) malloc(sizeof(FILA));
	if(f1 == NULL){
		printf("Erro de alocação. \n");
		exit(-1);
	} else {
		inicializaFila(f1);
		
		enifileira(10, f1);
		enifileira(20, f1);
		enifileira(30, f1);

		imprimeFila(f1);

		printf("Desenfileirando: %d\n", desenfileira(f1);
		imprimeFila(f1);

		printf("Desenfileirando: %d\n", desenfileira(f1);
		imprimeFila(f1);

		printf("Desenfileirando: %d\n", desenfileira(f1);
		imprimeFila(f1);
	}
	

}