package Lista1;

import java.util.Scanner;

public class Exerc�cio3 {
	//Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos
	//e mostre-o expresso em horas, minutos e segundos. 
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int tempoEvento;
		double horas;
		int minutos;
		
		System.out.println("Digite o tempo do evento em segundos: ");
		tempoEvento= leia.nextInt();
		minutos = tempoEvento/60;
		horas = minutos/60; 
		
		
		
		System.out.println("O tempo do evento de "+tempoEvento+" segundos em horas e em minutos � de:\n"+minutos+" minutos\n"+horas+" hora(s)");

	}

}
