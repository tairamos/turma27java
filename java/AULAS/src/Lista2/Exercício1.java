package Lista2;

import java.util.Scanner;

public class Exerc�cio1 {
	//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int um,dois,tres;
		int maior=0;
		
		System.out.println("Digite o primeiro valor: ");
		um=read.nextInt();
		System.out.println("Digite o segundo valor: ");
		dois=read.nextInt();
		System.out.println("Digite o terceiro valor: ");
		tres=read.nextInt();

	    if(um > dois && um > tres) {
	        maior = um;
	    }
	    else if (dois > um && dois > tres) {
	        maior = dois;
	    }
	    else if (tres > um && tres > dois) {
	    	maior = tres;
	    }
		 System.out.printf("O maior n�mero �: %d", maior);
	}
}