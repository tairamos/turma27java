package Lista1;

import java.util.Scanner;

public class Exerc�cio4 {
	//Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
	//D=R+S/2 onde R=(A+B)� e S=(B+C)�
	
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
					
		System.out.println("O valor de D �: "+d);
	}

}
