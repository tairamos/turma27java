package Lista4;

public class Aviao {
		
		//atributos 
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
