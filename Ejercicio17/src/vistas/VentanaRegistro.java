package vistas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaRegistro extends JFrame{
	
	//private JFrame frameRegistro;
	private JPanel panelRegistro;
	private JPanel lamina_secundaria_Registro;
	
	private JLabel nombre;
	private JLabel apellido;
	private JLabel ciudad;
	private JLabel email;
	private JLabel salario;
	private JLabel fechaNacimiento;
	
	private JTextField nombreField;
	private JTextField apellidoField;
	private JTextField ciudadField;
	private JTextField emailField;
	private JTextField salarioField;
	private JTextField fechaNacimientoField;
	
	
	private JButton botonRegistro;
	
	private ActionListener registroActionListener; 
	
	private VentanaProductos nuevaProductos;
	
	public VentanaRegistro() {
		//frameRegistro = new JFrame("Registro");
		setTitle("Registro");
		ImageIcon icono = new ImageIcon("conectado-removebg-preview.png");
		setIconImage(icono.getImage());
		panelRegistro = new JPanel();
		
		setSize(700,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelRegistro.setLayout(new BorderLayout());
		
		lamina_secundaria_Registro = new JPanel();
        lamina_secundaria_Registro.setLayout(new GridLayout(6, 2));
        
		
        nombre = new JLabel("Nombre: ");
		apellido = new JLabel("Apellido: ");
		ciudad = new JLabel("Ciudad: ");
		email = new JLabel("Email: ");
		salario = new JLabel("Salario (ej: 2000.0): ");
		fechaNacimiento = new JLabel("Fecha de nacimiento (AAAA-MM-DD): ");
		
		
		nombreField = new JTextField(20);
		apellidoField = new JTextField(20);
		ciudadField = new JTextField(20);
		emailField = new JTextField(20);
		salarioField = new JTextField(20);
		fechaNacimientoField = new JTextField(20);
		
		
		
		botonRegistro = new JButton("Registrar");
		
		/*
		registroActionListener = new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						// si me da tiempo añadir : agregar suaurio a lista
						
						nuevaProductos = new VentanaProductos();
						//llamo a setVisible en constructor
					}
			
				};
		botonRegistro.addActionListener(registroActionListener);
		
		*/
		
		panelRegistro.add(botonRegistro, BorderLayout.SOUTH);
		
		lamina_secundaria_Registro.add(nombre);
		lamina_secundaria_Registro.add(nombreField);
		
		lamina_secundaria_Registro.add(apellido);
		lamina_secundaria_Registro.add(apellidoField);
		
		lamina_secundaria_Registro.add(ciudad);
		lamina_secundaria_Registro.add(ciudadField);
		
		lamina_secundaria_Registro.add(email);
		lamina_secundaria_Registro.add(emailField);
		
		lamina_secundaria_Registro.add(salario);
		lamina_secundaria_Registro.add(salarioField);
		
		lamina_secundaria_Registro.add(fechaNacimiento);
		lamina_secundaria_Registro.add(fechaNacimientoField);
		
		panelRegistro.add(lamina_secundaria_Registro, BorderLayout.CENTER);
		
		getContentPane().add(panelRegistro);
		//frameRegistro.setVisible(true);
	}
	
	public void limpiarFormularioRegistro() //Funcion de limpieza de formulario.
	{
		nombreField.setText("");
		apellidoField.setText("");
		ciudadField.setText("");
		emailField.setText("");
		salarioField.setText("");
		fechaNacimientoField.setText("");
	}


	public JTextField getNombreField() {
		return nombreField;
	}

	public JTextField getApellidoField() {
		return apellidoField;
	}

	public JTextField getCiudadField() {
		return ciudadField;
	}

	public JTextField getEmailField() {
		return emailField;
	}

	public JTextField getSalarioField() {
		return salarioField;
	}

	public JTextField getFechaNacimientoField() {
		return fechaNacimientoField;
	}
	public void mostrarMensaje() {
		System.out.println("Te has registrado con éxito");
	}

	public JButton getBotonRegistro() {
		return botonRegistro;
	}
	
	
	
}