package Lista4;

public class Exerc�cio2Avi�o {
		//Crie uma classe avi�o e apresente os atributos e m�todos referentes
		//esta classe, em seguida crie um objeto avi�o, defina as instancias deste
		//objeto e apresente as informa��es deste objeto no console.
	
			public int rodas;
			public String modelo;
			public String tipo;
			public boolean noAr;
			public int velocidade;
			public boolean ligado;
			
			
			public void ligar() {
				ligado = true;
			}
			public void desligar() {
				ligado = false;
			}
			public void decolando() {
				for (int x=1; x<10; x++) {
					aumentarVelocidade();
				}
				noAr = true;
			}
			public void pousar() {
				for (int x=1; x<10; x++){
					diminuirVelocidade();
				}
				noAr = false;
			}
			public void aumentarVelocidade() {
				velocidade++;
			}
			public void diminuirVelocidade() {
				velocidade--;
			}
	}
