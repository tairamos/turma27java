<<<<<<< HEAD
programa
{
	
	funcao inicio()
	{
		inteiro idade
		inteiro contador=1
		escreva("Digite sua Idade: ")
=======
programa
{
	
	funcao inicio()
	{
		inteiro idade
		inteiro contador=1
		escreva("Digite sua Idade: ")
>>>>>>> d6fa77950c42ee339a30aee82d49d2871a16156d
		leia(idade)
		
		enquanto (idade < 18){
			escreva("Você não tem permissão para acessar este conteúdo \n")
			escreva("Digite sua Idade: ")
			contador++
			se(contador>3){
				escreva("Você já tentou mais de 3 vezes! \n")
				pare
			}
			leia(idade)
			}
			se(contador==1){
				escreva("Parabéns,você tem acesso! ")
			}		
			senao{
				escreva("Saia do site")
		}
<<<<<<< HEAD
	}
=======
	}
>>>>>>> d6fa77950c42ee339a30aee82d49d2871a16156d
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 361; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */