package introducao;

import java.util.Scanner;

public class Teste3leia {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int anoNascimento;
		String nome;
		//escreva("Digite o nome:")
		System.out.println("Digite o seu nome: ");
		nome = leia.next();  	//No portugol - leia(nome)
		System.out.println("Digite seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		System.out.println("Oi "+nome+",sua idade é de "+(2021-anoNascimento)+" anos.");
		
		
		
		
	}

}
