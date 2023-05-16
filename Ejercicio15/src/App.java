import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vista vista = new Vista();
		Controlador controlador = new Controlador(vista);
		controlador.generarIndex(sc);
		sc.close();
	}

}
