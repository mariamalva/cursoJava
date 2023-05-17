package vistas;

import java.awt.BorderLayout;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class VistaBanco {
	
	private JFrame frameBienvenida;
	private JPanel panelBienvenida;
	private JPanel lamina_secundaria;
	
	private JLabel mensajeBienvenida;
	
	private JButton botonLogin;
	private JButton botonRegistro; 
	

	
	public VistaBanco (){
		ImageIcon icono = new ImageIcon("conectado-removebg-preview.png");
		
		frameBienvenida = new JFrame("Bienvenid@ a Homebanking");
		frameBienvenida.setIconImage(icono.getImage());
		panelBienvenida = new JPanel();
		
		frameBienvenida.setSize(700,100);
		frameBienvenida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelBienvenida.setLayout(new BorderLayout());
		lamina_secundaria = new JPanel();
        lamina_secundaria.setLayout(new GridLayout(1, 2));
        
		mensajeBienvenida = new JLabel("Bienvenid@ a nuestra "
				+ "aplicación de Homebanking, si ya sos usuario por "
				+ "favor logueate, sino, registrate");
		
				
		
		
		botonLogin = new JButton("Login");
		botonRegistro = new JButton("Registro");
		
		
		panelBienvenida.add(mensajeBienvenida, BorderLayout.CENTER);
		
		lamina_secundaria.add(botonLogin);
		lamina_secundaria.add(botonRegistro);
		
		panelBienvenida.add(lamina_secundaria, BorderLayout.SOUTH);
		frameBienvenida.getContentPane().add(panelBienvenida);
		frameBienvenida.setVisible(true);
		
	}
	
	
	
	public JButton getBotonLogin() {
		return botonLogin;
	}

	public JButton getBotonRegistro() {
		return botonRegistro;
	}




}
