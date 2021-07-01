
programa
{
	
	funcao inicio()
	{

	inteiro tempoEvento
	inteiro horas, minutos, segundos
	escreva("Digite o tempo de duração em segundos do evento: ")
	leia(tempoEvento)
		//1 minuto = 60 segundos
	
		minutos = tempoEvento/60
		horas = minutos/60
		
		escreva("O tempo do evento de "+tempoEvento+" segundos em horas e em minutos é de:\n"+minutos+" minutos\n"+horas+" hora(s)")

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 377; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */