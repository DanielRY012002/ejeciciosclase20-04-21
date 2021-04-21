package ejemplo1;

public class Hilo2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <5; i++) {
			System.out.println("Hilo 2");
		}
	}

}
