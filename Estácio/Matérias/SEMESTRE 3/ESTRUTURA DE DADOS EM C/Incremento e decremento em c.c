#include <stdio.h>



//Incremento e decremento



int main()
{

    	
	int xA = 1;

    	int yA = 0;

	int xB = 1;

	int yB = 0;
    

    	
	//  Primeiramente xA � acrescido de 1 e vira 2, depois atribui o valor 2 

    	//  a yA que � impresso na tela
    
	yA = ++xA;
 //Esta opera��o � equivalente ao trecho de c�digo abaixo
	
	//xB = xB + 1;   
    
	//yB = xB;

	//  Primeiramente yB recebe o valor de xB que � 1 e em seguida acrescenta 
    
	//  em 1 o valor de xB, tornando o seu valor para 2
    
	yB = xB++;
 //Esta opera��o � equivalente ao trecho de c�digo abaixo


	//yB = xB;
	//xB = xB + 1;   
    
	
	printf("Valor de xA: %i\n", xA); //Resultado 2, ++xA
    
	printf("Valor de yA: %i\n", yA); //Resultado 2, pois � atribu�do o valor de xA ap�s ser incrementado
    


	printf("\n");
    


	printf("Valor de xB: %i\n", xB); //Resultado 2, xB++
    
	printf("Valor de yB: %i\n", yB); //Resultado 1, pois � atribu�do o valor de xB antes do incremento
    
    

	getchar();

    

	return 0;

}