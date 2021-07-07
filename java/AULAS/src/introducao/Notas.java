package introducao;

import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		//String alunos[] = new String[4];	//0.....3 posições 
		String alunos[] = {"Lukas", "Daniel", "Pedro", "Kenzo"};
		int notas[] = new int [4];
		final int LIMITE = 4;
		for (int x=0; x<alunos.length; x++) {
			System.out.println(alunos[x]);
		}
		System.out.println(alunos[2]);
		
		for (int x=0; x<4; x++) {
			System.out.println(alunos[x]);
		}
		
	}
}
