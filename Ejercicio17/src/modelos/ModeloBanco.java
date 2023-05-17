package modelos;

import java.time.LocalDate;

public class ModeloBanco {
	
	// campos login
	private String nombreField_login;
	private String contraseniaField;
	
	//campos registro
	private String nombreField_registro;
	private String apellidoField;
	private String ciudadField;
	private String emailField;
	private double salarioField;
	private LocalDate fechaNacimientoField;
	
	//getters y setters
	public String getNombreField_login() {
		return nombreField_login;
	}
	public void setNombreField_login(String nombreField_login) {
		this.nombreField_login = nombreField_login;
	}
	public String getContraseniaField() {
		return contraseniaField;
	}
	public void setContraseniaField(String contraseniaField) {
		this.contraseniaField = contraseniaField;
	}
	public String getNombreField_registro() {
		return nombreField_registro;
	}
	public void setNombreField_registro(String nombreField_registro) {
		this.nombreField_registro = nombreField_registro;
	}
	public String getApellidoField() {
		return apellidoField;
	}
	public void setApellidoField(String apellidoField) {
		this.apellidoField = apellidoField;
	}
	public String getCiudadField() {
		return ciudadField;
	}
	public void setCiudadField(String ciudadField) {
		this.ciudadField = ciudadField;
	}
	public String getEmailField() {
		return emailField;
	}
	public void setEmailField(String emailField) {
		this.emailField = emailField;
	}
	public double getSalarioField() {
		return salarioField;
	}
	public void setSalarioField(double salarioField) {
		this.salarioField = salarioField;
	}
	public LocalDate getFechaNacimientoField() {
		return fechaNacimientoField;
	}
	public void setFechaNacimientoField(LocalDate fechaNacimientoField) {
		this.fechaNacimientoField = fechaNacimientoField;
	}
	
	
	
	
	
	
	
	

}
