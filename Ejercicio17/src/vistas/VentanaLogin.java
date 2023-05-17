package vistas;

import java.awt.BorderLayout;
import java.awt.GridLayout;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class VentanaLogin extends JFrame{
	
	//private JFrame frameLogin;
	private JPanel panelLogin;
	private JPanel lamina_secundaria_login;
	
	private JLabel nombreUsuario;
	private JLabel contrasenia;
	
	private JTextField nombreField;
	private JPasswordField contraseniaField;
	
	private JButton botonAcceso;
	

	
	public VentanaLogin() {
		//frameLogin = new JFrame("Login");
		setTitle("Login");
		ImageIcon icono = new ImageIcon("conectado-removebg-preview.png");
		setIconImage(icono.getImage());
		panelLogin = new JPanel();
		
		setSize(700,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelLogin.setLayout(new BorderLayout());
		
		lamina_secundaria_login = new JPanel();
        lamina_secundaria_login.setLayout(new GridLayout(2, 2));
        	
		
        nombreUsuario = new JLabel("Nombre usuario: ");
		contrasenia = new JLabel("Contraseña: ");
		
		nombreField = new JTextField(20);
		contraseniaField = new JPasswordField(20);
		
		botonAcceso = new JButton("Acceder");
		
	
		panelLogin.add(botonAcceso, BorderLayout.SOUTH);
		
		lamina_secundaria_login.add(nombreUsuario);
		lamina_secundaria_login.add(nombreField);
		
		lamina_secundaria_login.add(contrasenia);
		lamina_secundaria_login.add(contraseniaField);
		
		panelLogin.add(lamina_secundaria_login, BorderLayout.CENTER);
		
		
		getContentPane().add(panelLogin);
	}
	
	public void limpiarFormularioLogin() 
	{
		nombreField.setText("");
		contraseniaField.setText("");
	}

	public JButton getBotonAcceso() {
		return botonAcceso;
	}

	public JTextField getNombreField() {
		return nombreField;
	}

	public JPasswordField getContraseniaField() {
		return contraseniaField;
	}
	public void mostrarMensaje() {
		System.out.println("Debes introducir tus credenciales");
	}
	
	
}

