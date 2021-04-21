package ejercicio2;

public class Principal {
	public static void main(String[] args) {
		String[] nombres= {"chino","negro","chechi","yenni","daniel","andre","aylan","kevin","sarah","maricielo"};
		for (String nomb:nombres) {
			Hilo h= new Hilo(nomb);
			Thread t=new Thread(h);
			t.start();
		}
	}
}
