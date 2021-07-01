package Lista1;

import java.util.Scanner;

public class Exercício4 {
	//Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
	//D=R+S/2 onde R=(A+B)² e S=(B+C)²
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double d,r,s,a,b,c;
		
		System.out.println("Digite o valor de A: ");
		a= leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b= leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c= leia.nextInt();
			r= (a+b)*(a+b);
				s= (b+c)*(b+c);
					d= ((r+s)/2);
					
		System.out.println("O valor de D é: "+d);
	}

}
