programa
{
	
	funcao inicio()
	{
		cadeia nomeAluno[4]
		inteiro notaAluno[4]

		escreva ("*Cadastro de Alunos* \n")
			para(inteiro i=0; i<=3; i++){
				escreva ("Digite o Nome do aluno: ")
				leia(nomeAluno[i])
				escreva("Insira a nota : ")
				leia(notaAluno[i])
			
		}
		limpa()
			para(inteiro i=0; i<=3; i++){
				escreva (nomeAluno[i]," Sua nota é: ",notaAluno[i], "\n")
				se (notaAluno[i] <= 5){
				escreva("Você não atingiu a meta\n")
			}
		senao {
			escreva("Parabéns, você atingiu a meta\n ")
		}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 517; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */