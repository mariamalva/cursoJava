package vistas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	
	private VentanaLogin nuevoLogin;
	
	private VentanaRegistro nuevoRegistro;
	
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
		
				/*
				 * setLayout(new BorderLayout());
        lamina_secundaria = new JPanel();
        lamina_secundaria.setLayout(new GridLayout(1, 3));
				 */
				
		//setTitle("Bienvenid@ a Homebanking");
		
		
		botonLogin = new JButton("Login");
		botonRegistro = new JButton("Registro");
		/*
		loginActionListener = new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						nuevoLogin = new VentanaLogin();
						//llamo a setVisible en controlador
					}
			
				};
		
		
		botonLogin.addActionListener(loginActionListener);
		
		registroActionListener = new ActionListener()
				{
					public void actionPerformed(ActionEvent e1)
					{
						nuevoRegistro = new VentanaRegistro();
						//llamo a setVisible en controlador
					}
				
				};
		botonRegistro.addActionListener(registroActionListener);
		*/
		
		panelBienvenida.add(mensajeBienvenida, BorderLayout.CENTER);
		
		lamina_secundaria.add(botonLogin);
		lamina_secundaria.add(botonRegistro);
		
		panelBienvenida.add(lamina_secundaria, BorderLayout.SOUTH);
		frameBienvenida.getContentPane().add(panelBienvenida);
		frameBienvenida.setVisible(true);
		//getContentPane().add(botonLogin);
		//getContentPane().add(botonRegistro);
	}
	
	
	
	public JButton getBotonLogin() {
		return botonLogin;
	}

	public JButton getBotonRegistro() {
		return botonRegistro;
	}



/*
	class VentanaLogin extends JFrame{
		
		//private JFrame frameLogin;
		private JPanel panelLogin;
		private JPanel lamina_secundaria_login;
		
		private JLabel nombreUsuario;
		private JLabel contrasenia;
		
		private JTextField nombreField;
		private JPasswordField contraseniaField;
		
		private JButton botonAcceso;
		
		private ActionListener accesoActionListener; 
		
		private VentanaProductos nuevaProductos;
		
		public VentanaLogin() {
			//frameLogin = new JFrame("Login");
			setTitle("Login");
			panelLogin = new JPanel();
			
			//frameLogin.setSize(500,400);
			//frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(500,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			panelLogin.setLayout(new BorderLayout());
			
			lamina_secundaria_login = new JPanel();
	        lamina_secundaria_login.setLayout(new GridLayout(2, 2));
	        	
			
	        nombreUsuario = new JLabel("Nombre usuario: ");
			contrasenia = new JLabel("Contraseña: ");
			
			nombreField = new JTextField(20);
			contraseniaField = new JPasswordField(20);
			
			botonAcceso = new JButton("Acceder");
			
			accesoActionListener = new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							
							
							nuevaProductos = new VentanaProductos();
							//llamo a setVisible en constructor
						}
				
					};
			botonAcceso.addActionListener(accesoActionListener);
			
			panelLogin.add(botonAcceso, BorderLayout.SOUTH);
			
			lamina_secundaria_login.add(nombreUsuario);
			lamina_secundaria_login.add(nombreField);
			
			lamina_secundaria_login.add(contrasenia);
			lamina_secundaria_login.add(contraseniaField);
			
			panelLogin.add(lamina_secundaria_login, BorderLayout.CENTER);
			
			//frameLogin.getContentPane().add(panelLogin);
			//frameLogin.setVisible(true);
			getContentPane().add(panelLogin);
		}
		
		public void limpiarFormularioLogin() //Funcion de limpieza de formulario.
		{
			nombreField.setText("");
			contraseniaField.setText("");
		}

		public VentanaProductos getNuevaProductos() {
			return nuevaProductos;
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
	
	*/
	/*
	class VentanaRegistro extends JFrame{
		
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
			panelRegistro = new JPanel();
			
			setSize(500,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			panelRegistro.setLayout(new BorderLayout());
			
			lamina_secundaria_Registro = new JPanel();
	        lamina_secundaria_Registro.setLayout(new GridLayout(6, 2));
	        
			
	        nombre = new JLabel("Nombre: ");
			apellido = new JLabel("Apellido: ");
			ciudad = new JLabel("Ciudad: ");
			email = new JLabel("Email: ");
			salario = new JLabel("Salario: ");
			fechaNacimiento = new JLabel("Fecha de nacimiento: ");
			
			
			nombreField = new JTextField(20);
			apellidoField = new JTextField(20);
			ciudadField = new JTextField(20);
			emailField = new JTextField(20);
			salarioField = new JTextField(20);
			fechaNacimientoField = new JTextField(20);
			
			
			
			botonRegistro = new JButton("Registrar");
			
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

		public VentanaProductos getNuevaProductos() {
			return nuevaProductos;
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
		
		
		
	}*/
	/*
	class VentanaProductos extends JFrame{
		
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
			panelProductos = new JPanel();
			
			setSize(500,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			panelProductos.setLayout(new BorderLayout());
			
			lamina_secundaria_productos = new JPanel();
	        lamina_secundaria_productos.setLayout(new GridLayout(1, 2));
	        //arriba con jlabel y boton logout
	        
	   
	        susProductos = new JLabel("Información de sus productos");
			
			botonLogOut = new JButton("Cerrar sesión");
			
			cierreActionListener = new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							
							//llamo a setVisible en constructor
						}
				
					};
			botonLogOut.addActionListener(cierreActionListener);
			
			//panelProductos.add(LISTA DE PRODUCTOS-CLASE TARJETA, BorderLayout.CENTER);
			
			lamina_secundaria_productos.add(susProductos);
			lamina_secundaria_productos.add(botonLogOut);
			
			panelProductos.add(lamina_secundaria_productos, BorderLayout.NORTH);
			
			getContentPane().add(panelProductos);
			//frameProductos.setVisible(true);
		}
		
		public void mostrarMensaje() {
			System.out.println("Has inciado sesión. Ya puedes ver tus productos");
		}
		
		
	}
*/
}
