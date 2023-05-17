package vistas;


import java.text.DecimalFormat;
import java.awt.BorderLayout;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;

public class VentanaProductos extends JFrame{
	

	private JPanel panelProductos;
	private JPanel lamina_secundaria_productos;
	
	private JLabel susProductos;

	private JButton botonLogOut;
	
	
	public VentanaProductos() {
		
		
		setTitle("Sus productos");
		ImageIcon icono = new ImageIcon("conectado-removebg-preview.png");
		setIconImage(icono.getImage());
		panelProductos = new JPanel();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelProductos.setLayout(new BorderLayout());
		
		lamina_secundaria_productos = new JPanel();
        lamina_secundaria_productos.setLayout(new GridLayout(1, 2));
    
        
   
        susProductos = new JLabel("Información de sus productos");
        
		botonLogOut = new JButton("Cerrar sesión");
		
	
		lamina_secundaria_productos.add(susProductos);
		lamina_secundaria_productos.add(botonLogOut);
		
		panelProductos.add(lamina_secundaria_productos, BorderLayout.NORTH);
		
		getContentPane().add(panelProductos);
		
		pack();
	}
	
	public void mostrarTarjeta(String nombre, String gastos, String saldo, String fechaVencimiento) {
		JPanel lamina_tres_productos = new JPanel();
		lamina_tres_productos.setLayout(new GridLayout(4, 1));
		
		JLabel nombreTarjeta = new JLabel("Tarjeta: " + nombre);
		DecimalFormat df = new DecimalFormat("#.00");
		JLabel gastosTarjeta = new JLabel("Gastos: " + df.format(Double.parseDouble(gastos)));
		JLabel saldoTarjeta = new JLabel("Saldo: " + df.format(Double.parseDouble(saldo)));
		JLabel fechaVencimientoTarjeta = new JLabel("Fecha de vencimiento: " + fechaVencimiento);
		
		lamina_tres_productos.add(nombreTarjeta);
		lamina_tres_productos.add(gastosTarjeta);
		lamina_tres_productos.add(saldoTarjeta);
		lamina_tres_productos.add(fechaVencimientoTarjeta);
		
		panelProductos.add(lamina_tres_productos, BorderLayout.CENTER);
		
		this.getContentPane().add(panelProductos);
		this.pack();
	}
	
	public void mostrarMensaje() {
		System.out.println("Has inciado sesión. Ya puedes ver tus productos");
	}

	public JButton getBotonLogOut() {
		return botonLogOut;
	}
	public void mostrarDespedida() {
		System.out.println("Cerrada sesión");
	}

	
	
	
}