programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro idadeDias,idadeAnos,idadeMeses,dias
	
		
		escreva("Digite o seu nome: ")
		leia(nome)
		escreva("Digite a sua idade em dias: ")
		leia(idadeDias)
		idadeAnos = idadeDias/365
		idadeMeses = (idadeDias%365)/30
		dias = (idadeDias%365)%30
		escreva("Olá "+nome+",sua idade é de: "+dias+" dias\n"+idadeAnos+" anos\n"+idadeMeses+" meses")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 395; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */