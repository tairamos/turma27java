programa
{
	inclua biblioteca Matematica
	funcao inicio()
	{
		real x1,x2,y1,y2
		inteiro d
		
		escreva("DIgite o valor de X1:")
		leia(x1)
		escreva("DIgite o valor de X2:")
		leia(x2)
		escreva("DIgite o valor de Y1:")
		leia(y1)
		escreva("DIgite o valor de Y2:")
		leia(y2)
			d = Matematica.raiz((Matematica.potencia((x1-x2),2))+(Matematica.potencia((y2-y1),2)),2)
			escreva("A distancia D é igual a:" +d)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 418; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */