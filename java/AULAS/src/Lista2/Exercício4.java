package Lista2;

import java.util.Scanner;

public class Exerc�cio4 {
	//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se 
	//este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; 
	//se for �mpar exiba o n�mero elevado ao quadrado.

		public static void main(String[] args) {
			Scanner read=new Scanner(System.in);
			int numero;
			
			System.out.println("Digite um n�mero: ");
			numero = read.nextInt();
			if ((numero%2)==0) {
				System.out.printf("O n�mero � par e a sua raiz quadrada �: %.2f\n",Math.sqrt(numero));
				
			}
			else {
				System.out.printf("O n�mero � impar e seu quadrado �: %.2f\n",Math.pow(numero,2));
			}
		}		
}
