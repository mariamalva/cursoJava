import java.time.Duration;
import java.time.LocalDateTime;

public class VueloModelo {
	
	private String nombre;
	private String origen;
	private String destino;
	private LocalDateTime salida;
	private LocalDateTime llegada;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDateTime getSalida() {
		return salida;
	}

	public void setSalida(LocalDateTime salida) {
		this.salida = salida;
	}

	public LocalDateTime getLlegada() {
		return llegada;
	}

	public void setLlegada(LocalDateTime llegada) {
		this.llegada = llegada;
	}

	public double duracionDias(LocalDateTime salida, LocalDateTime llegada)
	{
		Duration duration = Duration.between(salida, llegada);
		double duracionDias = Double.valueOf(duration.toMinutes())/(24*60);
		
		return duracionDias;
	}
}
