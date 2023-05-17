import java.time.LocalDate;

import modelos.*;
import vistas.*;

public class MainBanco {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		ModeloBanco modeloBanco = new ModeloBanco(); //Declaro el modelo
		TarjetaBancaria tarjeta = new TarjetaBancaria();
		VistaBanco vistaBanco = new VistaBanco(); //Declaro la vista
	
		
		tarjeta.setNombre("Tarjeta de débito 1");
		tarjeta.setGastos(Math.random()*2000);
		tarjeta.setSaldo(Math.random()*4000);
		tarjeta.setFechaVencimiento(LocalDate.of(2021, 06, 17));
		
		ControladorBanco controlador = new ControladorBanco(modeloBanco, tarjeta, vistaBanco) ; 
	}

}
