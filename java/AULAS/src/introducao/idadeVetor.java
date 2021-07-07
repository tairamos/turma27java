package introducao;

import java.util.Scanner;

public class idadeVetor {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String [] nome = new String [3];
		int anoNascimento;
		int [] idade = new int [3];
		char [] sexo = new char [3];
		
		for(int x = 0; x<3; x++) {
	
		System.out.println("Bom dia! Digite seu nome: ");
		nome[0] = read.next();
		System.out.println("Digite o sexo: ");
		sexo[0] = read.next().charAt(0);
		System.out.println("Digite seu ano de nascimento: ");
		anoNascimento = read.nextInt();
		
		idade [0] = 2021-anoNascimento;
		if (idade[0] > idade[1]) {
			idade[1]=idade[0];
		}
		}
		System.out.println("Olá Sr/a/e "+nome+",sua idade é "+idade+ " anos!");

	}

}
