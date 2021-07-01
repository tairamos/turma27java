package Lista1;

import java.util.Scanner;

public class Exercício6 {
	//
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double d,x1,x2,y1,y2;
		double dComplet;	
		
		System.out.println("Digite o valor de X1: ");
		x1= leia.nextDouble();
		System.out.println("Digite o valor de X2: ");
		x2= leia.nextDouble();
		System.out.println("Digite o valor de Y1: ");
		y1= leia.nextDouble();
		System.out.println("Digite o valor de Y2: ");
		y2= leia.nextDouble();
		
			d= Math.pow((x2-x1),2)+ Math.pow((y2-y1),2);
			dComplet= Math.sqrt(d);
			
		System.out.print("A distância de D é igual a: "+dComplet);
			
	}

}
