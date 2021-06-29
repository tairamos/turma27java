programa
{
	
	funcao inicio()
	{
	/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
	 * Encontre após a maior pontuação e a apresente. 
	 */
		cadeia aluno[5]
		inteiro pontuacao[5]

		escreva ("*Pontuações de Atividade* \n")
			para(inteiro i=0; i<=4; i++){
				escreva ("Digite o Nome do aluno: ")
				leia(aluno[i])
				escreva("Insira a pontuação : ")
				leia(pontuacao[i])
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 428; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */