package ejercicio2;

public class Hilo extends Thread{
	private String nombre;
	public Hilo(String nombre) {
		this.nombre=nombre;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=1;i<=3;i++){
			System.out.println(nombre+" come un "+i+" pan con queso");
			
		}
		System.out.println("terminó: "+nombre);
	}

}
