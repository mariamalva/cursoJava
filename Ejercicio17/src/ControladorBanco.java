import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import modelos.*;
import vistas.*;



public class ControladorBanco {

	
	//modelos
	private ModeloBanco modeloBanco;
	private TarjetaBancaria tarjeta;
	
	//vistas
	private VistaBanco vistaBanco;
	private VentanaLogin nuevoLogin;
	private VentanaRegistro nuevoRegistro;
	private VentanaProductos nuevaProductos;
	
	public ControladorBanco(ModeloBanco modeloBanco, TarjetaBancaria tarjeta, VistaBanco vistaBanco) {
		
		this.modeloBanco = modeloBanco;
		this.tarjeta = tarjeta;
		this.vistaBanco = vistaBanco;
		
		
		this.vistaBanco.getBotonRegistro().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				nuevoRegistro = new VentanaRegistro();
				nuevoRegistro.setVisible(true);
				nuevoRegistro.getBotonRegistro().addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e1)
					{	
						
						
						String nombre = nuevoRegistro.getNombreField().getText(); //obtengo el nombre
						String apellido = nuevoRegistro.getApellidoField().getText(); 
						String ciudad = nuevoRegistro.getCiudadField().getText(); 
						String email = nuevoRegistro.getEmailField().getText(); 
						double salario = Double.parseDouble(nuevoRegistro.getSalarioField().getText()); 
						String fechaNacimiento = nuevoRegistro.getFechaNacimientoField().getText(); 
						
						
						
						modeloBanco.setNombreField_registro(nombre); //establezco el nombre
						modeloBanco.setApellidoField(apellido); //establezco la contrasenia
						modeloBanco.setCiudadField(ciudad);
						modeloBanco.setEmailField(email);
						modeloBanco.setSalarioField(salario);
						modeloBanco.setFechaNacimientoField(LocalDate.of(Integer.parseInt(fechaNacimiento.substring(0, 4)),Integer.parseInt(fechaNacimiento.substring(5, 7)), Integer.parseInt(fechaNacimiento.substring(8))));
						
						nuevoRegistro.limpiarFormularioRegistro();
						
						nuevoRegistro.mostrarMensaje();
						
						nuevaProductos = new VentanaProductos();
						
						nuevaProductos.setVisible(true);
						
						nuevaProductos.mostrarMensaje();
						
						mostrarTarjeta();
						
						nuevaProductos.getBotonLogOut().addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e2)
							{
								nuevaProductos.mostrarDespedida();
								System.exit(0);
							}
						});
						
					}
				});
			}
		});
		
		this.vistaBanco.getBotonLogin().addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e1)
			{
				
				nuevoLogin = new VentanaLogin();
				nuevoLogin.setVisible(true);
				nuevoLogin.mostrarMensaje();
				
				//campos
				
				nuevoLogin.getBotonAcceso().addActionListener(new ActionListener() {

					@SuppressWarnings("deprecation")
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						

						String nombre = nuevoLogin.getNombreField().getText(); 
						String contrasenia = nuevoLogin.getContraseniaField().getText();  
						
						modeloBanco.setNombreField_login(nombre); 
						modeloBanco.setContraseniaField(contrasenia); 
						
						
						nuevoLogin.limpiarFormularioLogin();
						
						nuevaProductos = new VentanaProductos();
						
						nuevaProductos.setVisible(true);
						
						nuevaProductos.mostrarMensaje();
						
						mostrarTarjeta();
						
						nuevaProductos.getBotonLogOut().addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent e2)
							{
								nuevaProductos.mostrarDespedida();
								System.exit(0);
							}
						});
					}
					
				});
			}
		});
	}
	
	public void mostrarTarjeta() {
		
		
		String nombre = tarjeta.getNombre();
		String gastos = Double.toString(tarjeta.getGastos());
		String saldo = Double.toString(tarjeta.getSaldo());
		String fechaVencimiento = tarjeta.getFechaVencimiento().toString();
		
		nuevaProductos.mostrarTarjeta(nombre, gastos, saldo, fechaVencimiento);
	}
	
	
	
}
