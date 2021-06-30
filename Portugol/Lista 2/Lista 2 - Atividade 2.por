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
		/* Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
		*E calcule o salário sabendo que ele ganha R$10,00 por hora. 
		*Quando o número de horas exceder a 50, calcule o excesso de pagamento armazenando-o na variável 
		*E, caso contrário, zere tal variável. A hora excedente de trabalho vale R$20,00. 
		*No final do processamento imprimir o salário total e o salário excedente.
		*/
		cadeia codigoFuncionario 
		inteiro numeroHorasTrabalhadas
		real excesso=0.00
		const real VALORHORATRABALHADA = 10.00
		const real VALORHORAEXCEDENTE = 20.00
		const inteiro LIMITEHORAS = 50
		real salarioTotal=0.00, salarioExcedente=0.00

		escreva("Digite o código de funcionário: ")
		leia(codigoFuncionario)
		escreva("Digite o número de horas trabalhadas: ")
		leia(numeroHorasTrabalhadas)

		se (numeroHorasTrabalhadas <=LIMITEHORAS){
			salarioTotal = numeroHorasTrabalhadas * VALORHORATRABALHADA
		} senao {
			salarioExcedente = (numeroHorasTrabalhadas - LIMITEHORAS)* VALORHORAEXCEDENTE
			salarioTotal = (LIMITEHORAS * VALORHORATRABALHADA) + salarioExcedente}

		escreva("Salário excedente: ",salarioExcedente,"\n")
		escreva("Salário Total: ",salarioTotal,"\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */