import java.time.LocalDateTime;

public class VueloControlador {
	
	private VueloModelo modelo;
	
	private VueloVista vista;
	
	
	public VueloControlador(VueloModelo modelo, VueloVista vista)
	{
		this.modelo=modelo;
		this.vista=vista;
		
	}
	
	
	public void generarVuelo(String nombre, String origen, String destino, LocalDateTime salida, LocalDateTime llegada)
	{
		modelo.setNombre(nombre);
		modelo.setOrigen(origen);
		modelo.setDestino(destino);
		modelo.setSalida(salida);
		modelo.setLlegada(llegada);
		
	}
	
	public void mostrarVuelo()
	{
		String nombre = modelo.getNombre();
		String origen = modelo.getOrigen();
		String destino = modelo.getDestino();
		LocalDateTime salida = modelo.getSalida();
		LocalDateTime llegada = modelo.getLlegada();
		double duracion = modelo.duracionDias(salida, llegada);
		vista.mostrarVuelo(nombre, origen, destino, salida, llegada, duracion);
	}
}
/*
Desarollar un ejercicio que implemente una 
Vista donde el usuario pueda ver la información 
de los vuelos en pantalla, los mismos los genera el programa.  
El programa debe informar lo siguiente: 
Nombre de vuelo: "Caribean Destination" 
ORIGEN: Barcelona 
Destino: El Caribe 
Hora de salida estimada: YYYY-MM-DD HH:MM:SS 
Hora de arribo estimada: YYYY-MM-DD HH:MM:SS 
Duracion del vuelo expresada en días: 
Donde el origen y el destino se muestren con fondo verde, 
y el resto a elección del desarrollador.  

ENTREGABLES: - Codigo del proyecto.  
CONSIDERACIONES: El proyecto debe implementar el 
Modelo-Vista-Controlador con componentes.
Realizarlo para 3 vuelos.
Vuelos declararlos en el mismo código
https://github.com/Ripper2021/JavaDesdeCero/tree/main/Clase%2013
*/