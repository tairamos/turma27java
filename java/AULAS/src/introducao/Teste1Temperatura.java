package introducao;

public class Temperatura {
		
	//Graus Celsius para Fahrenheit e Kelvin
	public static void main(String[] args) {
		String nome="Taila";
		double tempCelsius=36.56;
		double grausF;
		double grausKelvin;
				
		grausF= (tempCelsius*1.8)+32;
		grausKelvin =(grausF-32)*(5/9)+ 273.15;
		System.out.print("Seja bem vindo! "+nome+"\n");
		System.out.print(tempCelsius +" Graus Celsius");
		System.out.println("\n" + grausF +" Graus Fahrenheit");
		System.out.println(grausKelvin + " Graus Kelvin");
		
	}

}
