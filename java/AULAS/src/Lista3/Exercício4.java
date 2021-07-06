package Lista3;

import java.util.Scanner;

public class Exerc�cio4 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		//Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		//o n�mero de pessoas calmas; 
		//o n�mero de mulheres nervosas; 
		//o n�mero de homens agressivos; 
		//o n�mero de outros calmos;
		//o n�mero de pessoas nervosas com mais de 40 anos; 
		//o n�mero de pessoas calmas com menos de 18 anos.
		int idade = 0;
		char sexo;
		char opcao;
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0;
		int pessoasNervosasMais40Anos=0, pessoasCalmasMenos18Anos=0;
		char op = 'S';
		final int LIMITE = 150;
		int contador=1;
		
		while (op=='S' && contador <= LIMITE) {
			System.out.println("Participante "+contador);
			System.out.println("Digite a idade: ");
			idade = read.nextInt();
			System.out.println("Digite");
			System.out.print("1-Feminino\n2-Masculino\n3-Outros ");
			sexo= read.next().charAt(0);
			System.out.println("Selecione ");
			System.out.println("1-Pessoa calma\n2-Pessoa nervosa\n3-Pessoa agressiva ");
			opcao = read.next().charAt(0);
			
			if (opcao =='1') {
				pessoasCalmas++;
			}
			
			if (sexo =='1'&& opcao =='2') {
				mulheresNervosas++;
			}
			
			if (sexo == '2' && opcao =='3') {
				homensAgressivos++;
			}
			
			if (sexo == '3' && opcao =='3') {
				outrosCalmos++;
			}
			
			if(idade < 18 && opcao=='1') {
				pessoasCalmasMenos18Anos++;
			}
			
			if(idade > 40 && opcao == '2') {
				pessoasNervosasMais40Anos++;
			}
			System.out.println("Continua S/N: ");
			op = read.next().toUpperCase().charAt(0);
			//saida do loop
			contador++;

		System.out.println("Pessoas Calmas: " +pessoasCalmas);
		System.out.println("Mulheres Nervosas: " +mulheresNervosas);
		System.out.println("Homens Agressivos: " +homensAgressivos);
		System.out.println("Outros Calmos: " +outrosCalmos);
		}
	}
}