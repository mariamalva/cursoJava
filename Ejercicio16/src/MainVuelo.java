import java.time.LocalDateTime;

public class MainVuelo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		VueloModelo modelo = new VueloModelo();
		VueloVista vista = new VueloVista();
		VueloControlador controlador = new VueloControlador(modelo, vista);
		controlador.generarVuelo("Caribean Destination", "Barcelona", "El Caribe", LocalDateTime.of(2020, 10, 4, 21, 20, 55),LocalDateTime.of(2020, 10, 5, 9, 21, 1));
		controlador.mostrarVuelo();
		
		VueloModelo modelo2 = new VueloModelo();
		VueloVista vista2 = new VueloVista();
		VueloControlador controlador2 = new VueloControlador(modelo2, vista2);
		controlador2.generarVuelo("Maldives Destination", "Asturias", "Maldivas", LocalDateTime.of(2022, 10, 3, 20, 20, 54),LocalDateTime.of(2022, 10, 4, 9, 21, 1));
		controlador2.mostrarVuelo();
		
		VueloModelo modelo3 = new VueloModelo();
		VueloVista vista3 = new VueloVista();
		VueloControlador controlador3 = new VueloControlador(modelo3, vista3);
		controlador3.generarVuelo("Cies Destination", "Málaga", "Islas cies", LocalDateTime.of(2021, 10, 4, 10, 20, 55),LocalDateTime.of(2021, 10, 4, 11, 21, 1));
		controlador3.mostrarVuelo();
		
		//LocalDateTime.of(int year, int month, int dayOfMonth, int hour, int minute, int second)
	}

}
