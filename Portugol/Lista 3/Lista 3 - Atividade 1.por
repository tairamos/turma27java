programa
{
	
	funcao inicio()
	{
		real salario=0.00
		inteiro filhos=0
		real totalSalario=0.00
		inteiro totalFilho=0

		para (inteiro x=1;x<=20;x++){
			escreva("Digite o seu salário: ")
			leia(salario)
			escreva("Digite a quantidade de filhos: ")
			leia(filhos)
		totalSalario += salario 
		totalFilho += filhos //opção vista em mercado de trabalho 
		}
		
		escreva("\n")
		escreva("A média salarial é: ",((totalSalario)/20))
		escreva("\n")
		escreva("A media de filhos é: ",((totalFilho)/20))
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */