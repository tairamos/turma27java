programa
{
	/*Um dado é lançado 10 vezes e o valor correspondente é anotado. 
	Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
	A seguir determine e imprima a média aritmética dos lançamentos, 
	contabilize e apresente também quantas foram as ocorrências da maior pontuação.
	*/
	
	funcao inicio()
	{
		inteiro lancamentos[10]
		inteiro maiorPontuacao=0, contador=0
		real media=0.0, soma=0.0
	
		para(inteiro i=0; i<10; i++){
			lancamentos[i] = sorteia(1,6)
			escreva((i+1)+" Lançamento: "+lancamentos[i] +"\n")

			soma += lancamentos[i] 
			se(maiorPontuacao < lancamentos[i]){
				maiorPontuacao = lancamentos[i]
			}
		}
	para(inteiro i=0;i<10;i++){
		se(maiorPontuacao == lancamentos[i]){
			contador++
			}
		}

		media=soma/10
		escreva("\nA média aritmética dos lançamentos é: "+media+"\n")
		escreva("----------------------------------------------------------------")
		escreva("\nA maior pontuação sorteada foi: "+contador+"vezes\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 506; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */