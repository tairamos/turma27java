package Lista1;

import java.util.Scanner;

public class Exercício3 {
	//Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos
	//e mostre-o expresso em horas, minutos e segundos. 
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	double tempoEvento;
		double horas;
		double minutos;
		double segundos;
		
		System.out.println("Digite o tempo do evento em segundos: ");
		tempoEvento = leia.nextDouble();
		horas = tempoEvento/3600;
	        minutos = (tempoEvento%3600)/60;
	        segundos = (tempoEvento%3600)%60;

		
		
		System.out.printf("O evento durou cerca de %d horas, %d minutos e %d segundos", (int)horas, (int)minutos, (int)segundos);

	}

}
