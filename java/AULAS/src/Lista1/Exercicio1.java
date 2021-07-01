package Lista1;

import java.util.Scanner;

public class Exercicio1 {
	//Faça um sistema que leia a idade de uma pessoa expressa em anos, 
	//meses e dias e mostre-a expressa apenas em dias. 

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	int idadeAnos,idade,idadeMeses;
	String nome; 
	
	System.out.println("Digite o seu nome: ");
	nome=leia.next();
	System.out.println("Digite a sua idade: ");
	idadeAnos=leia.nextInt();
	idade = 365*idadeAnos;
	idadeMeses = idade*30;
	System.out.println("Olá "+nome+",sua idade em dias é de: "+idade+" dias");
			
	
	
	
	
	
	
	
	}
}
