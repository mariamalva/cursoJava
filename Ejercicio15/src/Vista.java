import java.util.Scanner;

public class Vista {
	

	public int solicitarNumRegistros(Scanner sc) 
	{
		
		System.out.println("Bienvenido. ¿Cuántos usuarios desea registrar?");
		
		int numRegistros = Integer.parseInt(sc.next());
	
		
		return numRegistros;
		
		
	}
	
	public void mostrarIndex(Usuario usuario) 
	{
		
		System.out.println("\nLos datos registrados para este usuario son:\n"
				+ "Nombre: " + usuario.getNombre() + ", Apellido: " + usuario.getApellido() + "\n"
				+ "Correo electrónico: "+ usuario.getCorreo() + "\n"
				+ "Nombre de usuario: " +  usuario.getNombreUsuario());
	}
	
	
}
