package Lista1;

import java.util.Scanner;

public class Exerc�cio2 {
	//Fa�a um sistema que leia a idade de uma pessoa expressa em dias
	//e mostre-a expressa em anos, meses e dias.

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idadeDias,idadeAnos,idadeMeses,dias;
		String nome; 
		
		System.out.println("Digite o seu nome: ");
		nome=leia.next();
		System.out.println("Digite a sua idade em dias: ");
		idadeDias=leia.nextInt();
		idadeAnos = idadeDias/365;
		idadeMeses = (idadeDias%365)/30;
		dias = (idadeDias%365)%30;
		System.out.println("Ol� "+nome+",sua idade � de: "+dias+" dias\n"+idadeMeses+" meses\n"+idadeAnos+" anos");

	}

}
