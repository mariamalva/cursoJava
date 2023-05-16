import java.util.Scanner;

public class Controlador {
	
	 private Vista vista;
	 
	 
	 public Controlador(Vista vista)
	 {
		 this.vista = vista;
		 
	 }
	 
	 
	 public void generarIndex(Scanner sc)
	 {
		 
		int numRegistros = vista.solicitarNumRegistros(sc);
		
		Usuario [] usuarios = new Usuario[numRegistros];
		
		
		for(int i=0; i<numRegistros; i++)
		{
			System.out.println("\nUsuario "+ (i+1));
			usuarios[i] = new Usuario();
			System.out.println("Introduce nombre: ");
			usuarios[i].setNombre(sc.next());
			System.out.println("Introduce apellido: ");
			usuarios[i].setApellido(sc.next());
			System.out.println("Introduce correo: ");
			usuarios[i].setCorreo(sc.next());
			System.out.println("Introduce nombre de usuario: ");
			usuarios[i].setNombreUsuario(sc.next());
			
			
			vista.mostrarIndex(usuarios[i]);
		}
		 
		
		 
	 }
	
	
}
