programa
{
	
	funcao inicio()
	{
	
		cadeia carretaFuracaoEd[] = {"Homem Aranha","Pantera Negra","Mulher Maravilha","Hulk","Dollynho"}
		inteiro numPersonagem 
		
		escreva("\n0 - ")
		escreva(carretaFuracaoEd[0])
		escreva("\n1 - ")
		escreva(carretaFuracaoEd[1])
	     escreva("\n2 - ")
		escreva(carretaFuracaoEd[2])
		escreva("\n3 - ")
		escreva(carretaFuracaoEd[3])
		escreva("\n4 - ")
		escreva(carretaFuracaoEd[4])
		escreva("\n")
		escreva("-------------------")
		escreva("\n")

			para(inteiro x=0; x<5; x++){
				escreva(x+" - "+carretaFuracaoEd[x]+"\n")
		}
		escreva("Digite o número do personagem de 0 a 4: ") 
		leia (numPersonagem)
		escreva(carretaFuracaoEd[numPersonagem])
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 577; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */