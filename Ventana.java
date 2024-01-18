import java.util.Scanner;

public class Ventana {
	private Scanner numero;
	private int opcion;
	
	public void iniciar() {
		
		numero = new Scanner(System.in);
		System.out.println("Seleccione 1 para encender y 0 para finalizar: ");
		opcion = numero.nextInt();
		
	}
	public void encender() {
		
		if ( opcion == 1) {
			System.out.println("Ha encendido el enfriador.");
			
		}
	
	}
	public void apagar() {
		
		if (opcion == 0) {
			System.out.println("El enfriador se encuentra apagado.");
		}
		
	}
	/*public void error() {
		
		while (true) {
			
			if (opcion != 1 || opcion != 0) {
				System.out.println("Opcion incorrecta! Intente nuevamente.");
			
		}
			
		
		}
	}*/
	public static void main(String[] arg) {
		Ventana ventana1;
		ventana1 = new Ventana();
		ventana1.iniciar();
		ventana1.encender();
		ventana1.apagar();
		
	}


}
