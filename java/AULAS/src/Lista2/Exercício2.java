package Lista2;

import java.util.Scanner;

public class Exercício2 {
	//Faça um programa que entre com três números e coloque em ordem crescente.

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Leia a: ");
		a = read.nextInt();
		System.out.println("Leia b: ");
		b = read.nextInt();
		System.out.println("Leia c: ");
		c = read.nextInt();
		
		if (a == b && b == c) {
			System.out.printf("%d - %d - %d", a,b,c);
		}
		else if (a > b && b > c) {
			System.out.printf("%d - %d - %d", c,b,a);
		}
		else if (a > b && a > c && c > b) {
			System.out.printf("%d - %d - %d", b,c,a);
		}
		else if (b > a && b > c && c > a) {
			System.out.printf("%d - %d - %d", a,c,b);
		}
	}
}