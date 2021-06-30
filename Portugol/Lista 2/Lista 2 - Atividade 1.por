<<<<<<< HEAD
programa
{
	
	funcao inicio()
	{
=======
programa
{
	
	funcao inicio()
	{
>>>>>>> d6fa77950c42ee339a30aee82d49d2871a16156d
		/* João,homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
		*Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo 
		*(50 quilos) deve pagar uma multa de R $4,00 por quilo excedente. 
		*João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. 
		*Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
		* Caso contrário, mostrar tais variáveis com o conteúdo ZERO.
		*/
		cadeia nome
		inteiro pesoTomates
		real excesso=0.00
		const real VALORMULTA = 4.00
		const real EXCEDENTE = 50.00
		real pesoTomatesTotal = 0.00 
		real valorTomatesExcedente = 0.00
		
		escreva("Qual o peso de tomates?: ")
		leia(pesoTomates)
		se(pesoTomates <=EXCEDENTE){
			escreva("Não houve excedente \n")
		}senao{
			excesso=(pesoTomates - EXCEDENTE)
			valorTomatesExcedente = (pesoTomates - EXCEDENTE)* VALORMULTA}

	     escreva("Peso Excedente:",excesso,"\n")
		escreva("Valor do Peso Excedente:",valorTomatesExcedente)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1143; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */