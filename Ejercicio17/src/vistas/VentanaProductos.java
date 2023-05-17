package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class VentanaProductos extends JFrame{
	
	//private JFrame frameProductos;
	private JPanel panelProductos;
	private JPanel lamina_secundaria_productos;
	
	private JLabel susProductos;
	//private JLabel contrasenia;
	
	//private JTextField nombreField;
	//private JPasswordField contraseniaField;
	
	private JButton botonLogOut;
	
	private ActionListener cierreActionListener; 
	
	public VentanaProductos() {
		
		//frameProductos = new JFrame("Sus productos");
		setTitle("Sus productos");
		ImageIcon icono = new ImageIcon("conectado-removebg-preview.png");
		setIconImage(icono.getImage());
		panelProductos = new JPanel();
		
		//setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panelProductos.setLayout(new BorderLayout());
		
		lamina_secundaria_productos = new JPanel();
        lamina_secundaria_productos.setLayout(new GridLayout(1, 2));
        //arriba con jlabel y boton logout
        
   
        susProductos = new JLabel("Información de sus productos");
        
		botonLogOut = new JButton("Cerrar sesión");
		
		//mpstrar productos: cuentas y trajetas
		
		/*
		cierreActionListener = new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						
						//llamo a setVisible en constructor
					}
			
				};
		botonLogOut.addActionListener(cierreActionListener);
		
		*/
		
		//panelProductos.add(LISTA DE PRODUCTOS-CLASE TARJETA, BorderLayout.CENTER);
		
		lamina_secundaria_productos.add(susProductos);
		lamina_secundaria_productos.add(botonLogOut);
		
		panelProductos.add(lamina_secundaria_productos, BorderLayout.NORTH);
		
		getContentPane().add(panelProductos);
		//frameProductos.setVisible(true);
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
	//public void mostrarCuenta(String nombre, String titular, String saldo) {
	
	
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