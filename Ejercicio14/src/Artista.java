import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Artista implements iCalculos{
	
	String nombre = "";
	String genero = "";
	double cantidadReproducciones = 0;
	String paisMasEscuchas = "";
	
	//Constructor
	public Artista(String nombre, String genero, double cantidadReproducciones,String paisMasEscuchas) {
		
		this.nombre=nombre;
		this.genero=genero;
		this.cantidadReproducciones = cantidadReproducciones;
		this.paisMasEscuchas = paisMasEscuchas;
	}
	@Override
	public double recaudacionMonetaria() {
		
		return this.cantidadReproducciones * 0.02;
	}

	@Override
	public double proyeccionAnual(double recaudacion) {
		// TODO Auto-generated method stub
		return recaudacion * 12;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce número de artistas a registrar: ");
		int num= sc.nextInt();
		
		Artista[] artistas = new Artista[num];
		
		String salida="";
		
		for(int i=0;i<num;i++) {
			int id= i+1;
			System.out.println("Introduce nombre del artista "+ id);
			String nombre = sc.next();
			
			System.out.println("Introduce el género del artista "+ id);
			String genero = sc.next();
			
			System.out.println("Introduce número de reproducciones del artista "+ id);
			Double num_repro = sc.nextDouble();
			
			System.out.println("Introduce país donde más se escucha al artista "+ id);
			String paisMasEscuchas = sc.next();
			
			artistas[i] = new Artista(nombre, genero, num_repro, paisMasEscuchas);
			
			double recaudacion = artistas[i].recaudacionMonetaria();
			
			double proyeccion = artistas[i].proyeccionAnual(recaudacion);
			
			salida +="Artista "+ id + "--> nombre: "+nombre+ ", género: "+ genero 
					+", número de reproducciones: "+ num_repro
					+", país donde más se escucha: "+ paisMasEscuchas
					+", recaudación monetaria: "+recaudacion
					+" y proyección anual: " + proyeccion +"\n";
		}
		
		sc.close();
		
		System.out.println(salida);
		
		try (
				PrintWriter writer = new PrintWriter(new FileWriter("datos_artistas.txt")))
			{
				writer.write(salida);
				System.out.println("Se generó el fichero con datos de los artistas");
			} 
			
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
