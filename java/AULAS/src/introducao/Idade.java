package introducao;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String nome;
		int anoNascimento, idade = 0;
		char sexo;
		
		System.out.println("Bom dia! Digite seu nome: ");
		nome = read.next();
		System.out.println("Digite o sexo: ");
		sexo = read.next().charAt(0);
		System.out.println("Digite seu ano de nascimento: ");
		anoNascimento = read.nextInt();
		
		idade=2021-anoNascimento;
		System.out.println("Olá Sr/a/e "+nome+",sua idade é "+idade+ " anos!");
		
		
	}
}
